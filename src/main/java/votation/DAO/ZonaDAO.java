package votation.DAO;

import votation.DTO.Zona;
import votation.util.HibernateUtil;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ZonaDAO {
	Session session = null;
	
	public void save(Zona zona) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(zona);
		session.getTransaction().commit();
		session.close();
	}

	public List<Zona> listarPorSecao(Integer idSecao) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Zona u WHERE u.secao.idSecao = " + idSecao;
		Query query = session.createQuery(hql);
		List<Zona> results = query.list();
		session.close();
		return results;
	}

	public Zona getById(Integer idZona) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Zona u WHERE u.idZona = " + idZona;
		Query query = session.createQuery(hql);
		Zona results = (Zona) query.list();
		session.close();
		return results;
	}

	public List<Zona> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Zona u";
		Query query = session.createQuery(hql);
		List<Zona> results = query.list();
		session.close();
		return results;
	}

}
