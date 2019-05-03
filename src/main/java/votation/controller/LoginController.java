package votation.controller;

import static java.lang.System.out;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import votation.DAO.UsuarioDAO;
import votation.DTO.Usuario;
import votation.service.UsuarioService;

@WebServlet(name = "Logar", urlPatterns = { "/Logar" })
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {

		} finally {
			out.close();
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("numeroTitulo");
		String senha = request.getParameter("senha");

		if (username != null && senha != null) {
			RequestDispatcher rd = null;

			UsuarioService uc = new UsuarioService();

			try {
				Usuario usuario = uc.verificaUsuario(username, senha);
				if (usuario != null) {

					HttpSession session = request.getSession(true);

					session.setAttribute("usuario", username);

					session.putValue("loginUsuario", session.getAttribute("usuario"));
					session.putValue("nomeUsuarioLogado", usuario.getNome());
					session.putValue("idUsuario", usuario.getIdUsuario());
					
					
					if(usuario.getTipoUsuario().getIdTipoUsuario() == 1) {
						request.getRequestDispatcher("voto.jsp").forward(request, response);
					}
					else if(usuario.getTipoUsuario().getIdTipoUsuario() == 2) {
						request.getRequestDispatcher("autenticaVoto.jsp").forward(request, response);
					}
					else if(usuario.getTipoUsuario().getIdTipoUsuario() == 3) {
						request.getRequestDispatcher("chefeSessao.jsp").forward(request, response);
					}
					else if(usuario.getTipoUsuario().getIdTipoUsuario() == 4) {
						request.getRequestDispatcher("menu_tre.jsp").forward(request, response);
					}
					//request.getRequestDispatcher("index.jsp").forward(request, response);

				} else {
					request.setAttribute("msg", "Usu�rio ou Senha inv�lidos");
					rd = request.getRequestDispatcher("error403.jsp");
					rd.forward(request, response);

				}
			} catch (Exception ex) {
				Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}

/*public class LoginController {
	public Usuario login(String numero_titulo, String senha) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.login(numero_titulo, senha);
		
	}
}*/
