package com.secretparthner.ejb;

import com.secretparthner.model.Items;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ItemsFacadeLocal {

    void create(Items items);

    void edit(Items items);

    void remove(Items items);

    Items find(Object id);

    List<Items> findAll();

    List<Items> findRange(int[] range);

    int count();
    
}
