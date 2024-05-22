package com.example.shopeefood.repository;


import com.example.shopeefood.model.DetailCart;
import com.example.shopeefood.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {
}
