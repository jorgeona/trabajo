package uce.ona.jorge.entidades;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.enterprise.context.Dependent;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Dependent
@RegisterRestClient
@Produces({MediaType.APPLICATION_JSON})
@Consumes(MediaType.APPLICATION_JSON)
public interface restClient {

    @POST
    @Path("/member/add/")
    direccionDto add(direccionDto persona);
}