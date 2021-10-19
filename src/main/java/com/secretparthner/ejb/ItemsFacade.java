package com.secretparthner.ejb;

import com.secretparthner.model.Items;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ItemsFacade extends AbstractFacade<Items> implements ItemsFacadeLocal {

    @PersistenceContext(unitName = "SecretParthnerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ItemsFacade() {
        super(Items.class);
    }
    
}
