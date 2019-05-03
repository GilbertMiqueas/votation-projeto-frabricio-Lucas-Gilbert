package votation.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.UsuarioVoto;
import votation.util.HibernateUtil;

public class UsuarioVotoDAO {
	Session session = null;

	public void save(UsuarioVoto UsuarioVoto) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(UsuarioVoto);
		session.getTransaction().commit();
		session.close();
	}

	public List<UsuarioVoto> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM UsuarioVoto u";
		Query query = session.createQuery(hql);
		List<UsuarioVoto> results = query.list();
		session.close();
		return results;
	}

	public UsuarioVoto getById(Integer idUsuarioVoto) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM UsuarioVoto u WHERE u.idUsuarioVoto = " + idUsuarioVoto;
		Query query = session.createQuery(hql);
		UsuarioVoto results = null;
		List resultado = query.list();
		if(resultado.size() > 0){
			results = (UsuarioVoto) resultado.get(0);
		}
		session.close();
		return results;
	}
	
	public UsuarioVoto verificarTitulo(String titulo) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM UsuarioVoto u WHERE u.numeroTitulo = " + titulo;
		Query query = session.createQuery(hql);
		List resultado = query.list();
		UsuarioVoto results  = null;
		if(resultado.size() > 0) {
			results = (UsuarioVoto) resultado.get(0);	
		}
		session.close();
		return results;
	}
}
