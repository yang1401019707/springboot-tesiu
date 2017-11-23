package com.jk.dao;

import com.jk.model.Sale;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by 杨 on 2017/11/16.
 */
public interface SaleRepository extends JpaRepository<Sale, Long>,JpaSpecificationExecutor<Sale> {



}
