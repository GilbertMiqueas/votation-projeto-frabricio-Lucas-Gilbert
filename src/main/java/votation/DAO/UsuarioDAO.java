package votation.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.Usuario;
import votation.util.HibernateUtil;

public class UsuarioDAO {
	Session session = null;

	public void save(Usuario usuario) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(usuario);
		session.getTransaction().commit();
		session.close();
	}

	public List<Usuario> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u";
		Query query = session.createQuery(hql);
		List<Usuario> results = query.list();
		session.close();
		return results;
	}

	public Usuario getById(Integer idUsuario) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u WHERE u.idUsuario = " + idUsuario;
		Query query = session.createQuery(hql);
		Usuario results = null;
		List resultado = query.list();
		if(resultado.size() > 0){
			results = (Usuario) resultado.get(0);
		}
		session.close();
		return results;
	}
	
	public Usuario verificarTitulo(String titulo) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u WHERE u.numeroTitulo = " + titulo;
		Query query = session.createQuery(hql);
		List resultado = query.list();
		Usuario results  = null;
		if(resultado.size() > 0) {
			results = (Usuario) resultado.get(0);	
		}
		session.close();
		return results;
	}


	public Usuario buscarCandidatao(String numeroCandidato) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u WHERE u.idUsuario = " + numeroCandidato
				+ " AND u.tipoUsuario.idTipoUsuario = 5";
		Query query = session.createQuery(hql);
		List result = query.list();
		Usuario results = null;
		if (result != null && result.size() > 0) {
			results = (Usuario) result.get(0);
		}
		session.close();
		return results;
	}

	public Usuario verificaTituloSecao(String titulo, String secao) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u WHERE u.numeroTitulo = " + titulo + " AND u.zona.secao.nome = " + secao;
		Query query = session.createQuery(hql);
		List results = query.list();
		Usuario retorno = null;
		if (results != null && results.size() > 0) {
			retorno = (Usuario) results.get(0);
		}
		session.close();
		return retorno;
	}

	public Usuario verificaUsuario(String numeroTitulo, String senha) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u WHERE u.numeroTitulo = " + numeroTitulo + " AND u.senha = " + senha;
		Query query = session.createQuery(hql);
		List results = query.list();
		if (results != null && !results.isEmpty()) {
			Usuario usuario = (Usuario) query.list().get(0);
			session.close();
			return usuario;
		}
		session.close();
		return null;
	}
}

/*public class UsuarioDAO {
	Session session = null;

	public void save(Usuario usuario) {
		session.beginTransaction();
		session.save(usuario);
		session.getTransaction().commit();
		session.close();
	}

	public List<Usuario> listarTodos() {
		String hql = "SELECT u FROM Usuario u";
		Query query = session.createQuery(hql);
		List<Usuario> results = query.list();
		session.close();
		return results;
	}
	
	public Usuario login(String numero_titulo, String senha) {
		 session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Usuario u WHERE u.numeroTitulo = "+ numero_titulo +" AND u.senha = " + senha;
		Query query = session.createQuery(hql);
		List results = query.list();
		if(results != null && !results.isEmpty()) {
			Usuario usuario = (Usuario) query.list().get(0);
			session.close();
			return usuario;
		}
		session.close();
		return null;
	}
}*/

