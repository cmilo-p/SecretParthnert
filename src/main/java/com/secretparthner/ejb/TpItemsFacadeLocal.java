package com.secretparthner.ejb;

import com.secretparthner.model.TpItems;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TpItemsFacadeLocal {

    void create(TpItems tpItems);

    void edit(TpItems tpItems);

    void remove(TpItems tpItems);

    TpItems find(Object id);

    List<TpItems> findAll();

    List<TpItems> findRange(int[] range);

    int count();
    
}
