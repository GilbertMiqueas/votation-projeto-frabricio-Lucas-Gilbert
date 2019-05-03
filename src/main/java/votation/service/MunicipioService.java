package votation.service;

import java.util.ArrayList;
import java.util.List;

import votation.DAO.MunicipioDAO;
import votation.DTO.Municipio;
import votation.object.ObjectGenerico;
import votation.service.MunicipioService;

public class MunicipioService {
	public List<ObjectGenerico> listarMunicipios(Integer idUf) {
		MunicipioDAO municipioDAO = new MunicipioDAO();
		List<Municipio> listaMunicipio = municipioDAO.listarPorUf(idUf);
		List<ObjectGenerico> listaRetorno = new ArrayList<>();
		ObjectGenerico object = null;
		for(Municipio municipio : listaMunicipio){
			object = new ObjectGenerico();
			object.setId(municipio.getIdMunicipio());
			object.setDescricao(municipio.getNome());
			listaRetorno.add(object);
		}
		return listaRetorno;
	}
}