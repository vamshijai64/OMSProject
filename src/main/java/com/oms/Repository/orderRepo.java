package com.oms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.Entity.Order;
@Repository
public interface orderRepo extends JpaRepository<Order, Integer>{

}
