package votation.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.Usuario;
import votation.util.HibernateUtil;



public class UsuarioDAO {
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
}

