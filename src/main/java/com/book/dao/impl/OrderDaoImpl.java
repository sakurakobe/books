package com.book.dao.impl;

import com.book.dao.OrderDao;
import com.book.pojo.Order;

import java.util.List;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {

        System.out.println(" OrderDaoImpl 程序在[" +Thread.currentThread().getName() + "]中");

        String sql = "insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";

        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }

    @Override
    public List<Order> queryOrders(Integer id) {
        String sql = "select `order_id` orderId, `create_time` createTime, `price` , `status` , `user_id` userId from t_order where user_id = ?" ;
        return queryForList(Order.class, sql,id);
    }
}
