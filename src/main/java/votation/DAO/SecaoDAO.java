package votation.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.Secao;
import votation.util.HibernateUtil;

public class SecaoDAO {
	Session session = null; 

	public void save(Secao Secao) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(Secao);
		session.getTransaction().commit();
		session.close();
	}
	public List<Secao> listarPorZona(Integer zona) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Secao u WHERE u.zona = " + zona;
		Query query = session.createQuery(hql);
		List<Secao> results = query.list();
		session.close();
		return results;
	}
	
	public Secao getById(Integer idSecao) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Secao u WHERE u.idSecao = " + idSecao;
		Query query = session.createQuery(hql);
		Secao results = (Secao) query.list().get(0);
		session.close();
		return results;
	}


	public List<Secao> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Secao u";
		Query query = session.createQuery(hql);
		List<Secao> results = query.list();
		session.close();
		return results;
	}
}
