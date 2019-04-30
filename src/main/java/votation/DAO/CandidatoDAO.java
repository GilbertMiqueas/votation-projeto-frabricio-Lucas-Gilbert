package votation.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import votation.DTO.Candidato;
import votation.util.HibernateUtil;

public class CandidatoDAO {
	Session session = null;


	public List<Candidato> listarCandidatosPorNumero(String numero) {
		 session = HibernateUtil.getSessionFactory().openSession();
		String hql = "SELECT c FROM Candidato c WHERE c.numero = " + numero;
		Query query = session.createQuery(hql);
		List<Candidato> results = query.list();
		session.close();
		return results;
	}
}
