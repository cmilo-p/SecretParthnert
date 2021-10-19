package com.secretparthner.ejb;

import com.secretparthner.model.Raffle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RaffleFacade extends AbstractFacade<Raffle> implements RaffleFacadeLocal {

    @PersistenceContext(unitName = "SecretParthnerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RaffleFacade() {
        super(Raffle.class);
    }
    
}
