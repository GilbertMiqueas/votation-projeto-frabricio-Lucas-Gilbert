package votation.service;

import java.text.SimpleDateFormat;

import java.util.List;

import votation.DAO.MunicipioDAO;
import votation.DAO.SecaoDAO;
import votation.DAO.TipoUsuarioDAO;
import votation.DAO.UsuarioDAO;
import votation.DAO.ZonaDAO;
import votation.DTO.Usuario;
import votation.object.ObjectUsuario;

public class UsuarioService {
	UsuarioDAO usuarioDAO = null;

	public List<Usuario> listarUsuarios() {
		usuarioDAO = new UsuarioDAO();
		return usuarioDAO.listarTodos();
	}

	public ObjectUsuario getById(Integer idUsuario) {
		ObjectUsuario objectUsuario = null;
//		Usuario usuario = usuarioDAO.getById(idUsuario);
//		if (usuario != null) {
//			SimpleDateFormat anoMesDia = new SimpleDateFormat();
//			objectUsuario = new ObjectUsuario();
//			if(usuario.getDataEmissao() != null){
//				objectUsuario.setDataEmissao(anoMesDia.format(usuario.getDataEmissao()));
//			}
//			if(usuario.getDataNascimento() != null){
//				objectUsuario.setData(anoMesDia.format(usuario.getDataNascimento()));	
//			}
//			objectUsuario.setNome(usuario.getNome());
//			objectUsuario.setIdUsuario(usuario.getIdUsuario());
//			objectUsuario.setMunicipio(usuario.getMunicipio() != null ? usuario.getMunicipio().getIdMunicipio() : null);
//			objectUsuario.setNumeroTitulo(usuario.getNumeroTitulo());
//			objectUsuario.setSenha(usuario.getSenha());
//			objectUsuario.setTipoUsuario(usuario.getTipoUsuario().getIdTipoUsuario());
//			objectUsuario.setZona(usuario.getZona() != null ? usuario.getZona().getIdZona() : null);
//			objectUsuario.setUf(usuario.getMunicipio() != null ? usuario.getMunicipio().getUf().getIdUf() : null);
//			objectUsuario.setSecao(usuario.getZona() != null ? usuario.getZona().getSecao().getIdSecao() : null);
//		}
		return objectUsuario;
	}

	public ObjectUsuario add(ObjectUsuario objectUsuario) {
		SimpleDateFormat anoMesDia = new SimpleDateFormat("yyyy-MM-dd");
		MunicipioDAO municipioDAO = new MunicipioDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		TipoUsuarioDAO tipoUsuarioDAO = new TipoUsuarioDAO();
		SecaoDAO secaoDAO = new SecaoDAO();
		Usuario usuario = new Usuario();
		try {
			usuario.setDataEmissao(anoMesDia.parse(objectUsuario.getDataEmissao()));
			usuario.setDataNascimento(anoMesDia.parse(objectUsuario.getData()));
		} catch (Exception e) {

		}
		usuario.setSecaoEleitoral(secaoDAO.getById(objectUsuario.getSecaoEleitoral()));
		usuario.setMunicipio(municipioDAO.getById(objectUsuario.getMunicipio()));
		usuario.setNome(objectUsuario.getNome());
		usuario.setNumeroTitulo(objectUsuario.getNumeroTitulo());
		usuario.setSenha(objectUsuario.getSenha());
		usuario.setTipoUsuario(tipoUsuarioDAO.getById(objectUsuario.getTipoUsuario()));
		usuarioDAO.save	(usuario);
		return objectUsuario;
	}

	public Usuario verificaUsuario(String numeroTitulo, String senha) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = null;
		usuario = usuarioDAO.verificaUsuario(numeroTitulo, senha);
		return usuario;
	}
	/*public class LoginController {
	public Usuario login(String numero_titulo, String senha) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.login(numero_titulo, senha);
		
	}
}*/
}
