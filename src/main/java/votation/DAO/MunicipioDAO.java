package votation.DAO;

import votation.DTO.Municipio;
import votation.util.HibernateUtil;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class MunicipioDAO {
	Session session = null; 

	public void save(Municipio municipio) {
		session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(municipio);
		session.getTransaction().commit();
		session.close();
	}
	public List<Municipio> listarPorUf(Integer idUf) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Municipio u WHERE u.uf.idUf = " + idUf;
		Query query = session.createQuery(hql);
		List<Municipio> results = query.list();
		session.close();
		return results;
	}
	
	public Municipio getById(Integer idMunicipio) {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Municipio u WHERE u.idMunicipio = " + idMunicipio;
		Query query = session.createQuery(hql);
		Municipio results = (Municipio) query.list().get(0);
		session.close();
		return results;
	}


	public List<Municipio> listarTodos() {
		session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT u FROM Municipio u";
		Query query = session.createQuery(hql);
		List<Municipio> results = query.list();
		session.close();
		return results;
	}
}
