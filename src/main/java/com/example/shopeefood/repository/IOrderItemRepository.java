package com.example.shopeefood.repository;

import com.example.shopeefood.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderItemRepository extends JpaRepository<OrderItem,Long> {
    @Query("SELECT d FROM OrderItem d join Cart c ON d.cart.id = c.id WHERE d.shop = ?1 AND c.idUser = ?2 ")
    Iterable<OrderItem> findAllByShopAndCart(Shop shop, User user);
}
