package com.book.dao;

import com.book.pojo.Order;

import java.util.List;

public interface OrderDao {
    public int saveOrder(Order order);

    public List<Order> queryOrders(Integer id);
}
