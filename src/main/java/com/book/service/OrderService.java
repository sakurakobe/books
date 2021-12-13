package com.book.service;


import com.book.pojo.Cart;
import com.book.pojo.Order;
import com.book.pojo.OrderItem;

import java.util.List;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);

    public List<Order> queryOrders(Integer id);

    public List<OrderItem> queryOrderItems(long id);
}
