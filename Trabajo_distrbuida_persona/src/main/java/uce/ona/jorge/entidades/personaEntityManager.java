package uce.ona.jorge.entidades;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import uce.ona.jorge.main.*;

@Path("/")
public class personaEntityManager {

    @Inject
    conexion helper;

    @GET
    @Produces("application/json")
    public personaDto[] get() {
        return helper.getEntityManager().createNamedQuery("personaDto.findAll", personaDto.class).getResultList().toArray(new personaDto[0]);
    }
}
