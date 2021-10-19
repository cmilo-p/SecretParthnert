package com.secretparthner.ejb;

import com.secretparthner.model.Gift;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GiftFacadeLocal {

    void create(Gift gift);

    void edit(Gift gift);

    void remove(Gift gift);

    Gift find(Object id);

    List<Gift> findAll();

    List<Gift> findRange(int[] range);

    int count();
    
}
