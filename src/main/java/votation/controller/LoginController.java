package votation.controller;

import votation.DAO.UsuarioDAO;
import votation.DTO.Usuario;

public class LoginController {
	public Usuario login(String numero_titulo, String senha) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.login(numero_titulo, senha);
		
	}
}
