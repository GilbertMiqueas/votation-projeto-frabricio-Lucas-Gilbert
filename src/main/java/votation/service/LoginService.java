package votation.service;

/* import static java.lang.System.out;

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

import votation.DTO.Usuario;
import votation.controller.LoginController;

@WebServlet(name = "Logar", urlPatterns = { "/index" })
public class LoginService extends HttpServlet {

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

		String username = request.getParameter("titulo");
		String senha = request.getParameter("senha");
		String tipoUsuario = request.getParameter("tipo_usuario");
		if (username != null && senha != null) {
			RequestDispatcher rd = null;

			LoginController lc = new LoginController();

			try {
				Usuario usuario = lc.login(username, senha);
				if (usuario != null) {
					HttpSession session = request.getSession(true);
					session.setAttribute("usuario", username);
					session.putValue("loginUsuario", session.getAttribute("usuario")); // Grava a session com o Login
					
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
						request.getRequestDispatcher("cadastro_eleitor.jsp").forward(request, response);
					}
				
					
					


				} else {
					rd = request.getRequestDispatcher("error403.jsp");
					rd.forward(request, response);
				}
			} catch (Exception ex) {
				Logger.getLogger(LoginService.class.getName()).log(Level.SEVERE, null, ex);
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

}*/

