package com.secretparthner.ejb;

import com.secretparthner.model.Raffle_users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Raffle_usersFacade extends AbstractFacade<Raffle_users> implements Raffle_usersFacadeLocal {

    @PersistenceContext(unitName = "SecretParthnerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Raffle_usersFacade() {
        super(Raffle_users.class);
    }
    
}
