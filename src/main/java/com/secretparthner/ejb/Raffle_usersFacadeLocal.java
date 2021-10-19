package com.secretparthner.ejb;

import com.secretparthner.model.Raffle_users;
import java.util.List;
import javax.ejb.Local;

@Local
public interface Raffle_usersFacadeLocal {

    void create(Raffle_users raffle_users);

    void edit(Raffle_users raffle_users);

    void remove(Raffle_users raffle_users);

    Raffle_users find(Object id);

    List<Raffle_users> findAll();

    List<Raffle_users> findRange(int[] range);

    int count();
    
}
