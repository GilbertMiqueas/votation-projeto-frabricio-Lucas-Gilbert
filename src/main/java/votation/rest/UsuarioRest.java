package votation.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import votation.object.ObjectUsuario;
import votation.service.UsuarioService;

@Path("/usuario")
public class UsuarioRest {
	UsuarioService usuarioService = new UsuarioService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get_by_id/{idUsuario}")
	public ObjectUsuario getById(@PathParam("idUsuario") int idUsuario) {
		return usuarioService.getById(idUsuario);
	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/salvar")
	public ObjectUsuario add(String objectUsuario) {
		return usuarioService.add(new Gson().fromJson(objectUsuario, ObjectUsuario.class));
	}
}