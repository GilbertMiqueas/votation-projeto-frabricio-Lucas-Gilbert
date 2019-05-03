package votation.service;

import java.util.ArrayList;
import java.util.List;

import votation.DAO.SecaoDAO;
import votation.DTO.Secao;
import votation.object.ObjectGenerico;

public class SecaoService {
	public List<ObjectGenerico> listarSecao(Integer idZona) {
		SecaoDAO secaoDAO = new SecaoDAO();
		List<Secao> listaSecao = secaoDAO.listarPorZona(idZona);
		List<ObjectGenerico> listaRetorno = new ArrayList<>();
		ObjectGenerico object = null;
		for(Secao secao : listaSecao){
			object = new ObjectGenerico();
			object.setId(secao.getIdSecao());
			object.setDescricao(secao.getNome());
			listaRetorno.add(object);
		}
		return listaRetorno;
	}
}
