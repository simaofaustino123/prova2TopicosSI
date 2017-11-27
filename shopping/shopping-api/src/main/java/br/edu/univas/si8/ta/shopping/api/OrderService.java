package br.edu.univas.si8.ta.shopping.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/order")
public interface OrderService {
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listProductDescription();

	@POST
	@Path("/add/{description}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewProduct(@PathParam("description") String description);
}
