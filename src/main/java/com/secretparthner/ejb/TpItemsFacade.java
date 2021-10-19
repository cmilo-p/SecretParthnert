package com.secretparthner.ejb;

import com.secretparthner.model.TpItems;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TpItemsFacade extends AbstractFacade<TpItems> implements TpItemsFacadeLocal {

    @PersistenceContext(unitName = "SecretParthnerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TpItemsFacade() {
        super(TpItems.class);
    }
    
}
