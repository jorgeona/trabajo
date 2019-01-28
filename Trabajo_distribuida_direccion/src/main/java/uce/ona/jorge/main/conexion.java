package uce.ona.jorge.main;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@ApplicationScoped
public class conexion {

    @PersistenceContext
    private EntityManager cn;

    public EntityManager getEntityManager() {
        return cn;
    }
}
