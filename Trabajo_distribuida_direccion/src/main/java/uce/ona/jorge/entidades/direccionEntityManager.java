package uce.ona.jorge.entidades;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import uce.ona.jorge.main.*;

@Path("/")
public class direccionEntityManager {

    @Inject
    conexion helper;

    @GET
    @Produces("application/json")
    public direccionDto[] get() {
        return helper.getEntityManager().createNamedQuery("direccionDto.findAll", direccionDto.class).getResultList().toArray(new direccionDto[0]);
    }
}
