package com.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.Entity.Product;
@Repository
public interface productREpo extends JpaRepository<Product, Integer> {

}
