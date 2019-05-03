package votation.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import votation.object.ObjectGenerico;
import votation.service.MunicipioService;

@Path("/municipio")
public class MunicipioRest {
	MunicipioService municipioService = new MunicipioService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get_all/{idUf}")
	public List<ObjectGenerico> getByUf(@PathParam("idUf") int idUf) {
		return municipioService.listarMunicipios(idUf);
	}
}