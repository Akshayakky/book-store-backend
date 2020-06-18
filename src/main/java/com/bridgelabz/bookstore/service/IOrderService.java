package com.bridgelabz.bookstore.service;

import com.bridgelabz.bookstore.dto.OrderDTO;
import com.bridgelabz.bookstore.model.MyOrder;

import java.util.List;

public interface IOrderService {
    MyOrder addOrder(OrderDTO orderDTO);
    List<MyOrder> getAllOrders(long userId);
}