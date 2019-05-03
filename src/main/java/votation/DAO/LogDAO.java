package votation.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.Log;
import votation.DTO.Log;
import votation.util.HibernateUtil;

public class LogDAO {
	Session session = null; 

	public void save(Log Log) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(Log);
		session.getTransaction().commit();
		session.close();
	}
	
	public List<Log> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Log u";
		Query query = session.createQuery(hql);
		List<Log> results = query.list();
		session.close();
		return results;
	}
}
