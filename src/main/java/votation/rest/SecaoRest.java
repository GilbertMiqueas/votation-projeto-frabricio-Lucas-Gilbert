package votation.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import votation.object.ObjectGenerico;
import votation.service.SecaoService;

@Path("/secao")
public class SecaoRest {
	SecaoService secaoService = new SecaoService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get_all/{zona}")
	public List<ObjectGenerico> getByUf(@PathParam("zona") int zona) {
		return secaoService.listarSecao(zona);
	}
}