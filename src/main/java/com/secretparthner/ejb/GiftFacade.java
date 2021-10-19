package com.secretparthner.ejb;

import com.secretparthner.model.Gift;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GiftFacade extends AbstractFacade<Gift> implements GiftFacadeLocal {

    @PersistenceContext(unitName = "SecretParthnerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GiftFacade() {
        super(Gift.class);
    }
    
}
