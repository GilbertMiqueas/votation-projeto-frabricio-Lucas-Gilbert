package votation.DAO;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.Uf;
import votation.util.HibernateUtil;

public class UfDAO {
	Session session = null; 	

	public void save(Uf uf) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(uf);
		session.getTransaction().commit();
		session.close();
	}

	public List<Uf> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Uf u";
		Query query = session.createQuery(hql);
		List<Uf> results = query.list();
		session.close();
		return results;
	}
}
