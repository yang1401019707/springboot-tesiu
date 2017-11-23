package com.jk.service;

import com.jk.model.Sale;
import org.springframework.data.domain.Page;


import java.util.List;

/**
 * Created by 杨 on 2017/11/16.
 */
public interface SaleService {

    public List<Sale> getUserList();

    public Sale findUserById(long id);

    public void save(Sale sale);

    public void edit(Sale sale);

    public void delete(long id);


    Page<Sale> findSaleCriteria(Integer page,Integer size,Sale sale);


}
