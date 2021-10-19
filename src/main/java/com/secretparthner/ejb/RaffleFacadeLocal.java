package com.secretparthner.ejb;

import com.secretparthner.model.Raffle;
import java.util.List;
import javax.ejb.Local;

@Local
public interface RaffleFacadeLocal {

    void create(Raffle raffle);

    void edit(Raffle raffle);

    void remove(Raffle raffle);

    Raffle find(Object id);

    List<Raffle> findAll();

    List<Raffle> findRange(int[] range);

    int count();
    
}
