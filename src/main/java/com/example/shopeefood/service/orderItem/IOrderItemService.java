package com.example.shopeefood.service.orderItem;

import com.example.shopeefood.model.DetailCart;
import com.example.shopeefood.model.OrderItem;
import com.example.shopeefood.model.Shop;
import com.example.shopeefood.model.User;
import com.example.shopeefood.service.IGenerateService;

public interface IOrderItemService extends IGenerateService<OrderItem> {
    Iterable<OrderItem> findAllByShopAndCart(Shop shop, User user);
}
