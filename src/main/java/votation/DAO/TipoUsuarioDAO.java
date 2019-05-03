package votation.DAO;

import votation.DTO.TipoUsuario;
import votation.util.HibernateUtil;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class TipoUsuarioDAO {
	Session session = null; 
	private static TipoUsuarioDAO tipoUsuarioDAO;

	public void save(TipoUsuario tipoUsuario) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(tipoUsuario);
		session.getTransaction().commit();
		session.close();
	}
	
	public TipoUsuario getById(Integer idTipoUsuario) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM TipoUsuario u WHERE u.idTipoUsuario = " + idTipoUsuario;
		Query query = session.createQuery(hql);
		TipoUsuario results = (TipoUsuario) query.list().get(0);
		session.close();
		return results;
	}

	public List<TipoUsuario> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM TipoUsuario u";
		Query query = session.createQuery(hql);
		List<TipoUsuario> results = query.list();
		session.close();
		return results;
	}
}
