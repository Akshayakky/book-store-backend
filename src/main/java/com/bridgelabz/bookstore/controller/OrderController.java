package com.bridgelabz.bookstore.controller;

import com.bridgelabz.bookstore.dto.OrderDTO;
import com.bridgelabz.bookstore.model.MyOrder;
import com.bridgelabz.bookstore.service.IOrderService;
import com.bridgelabz.bookstore.utility.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    IOrderService iOrderService;

    @Autowired
    JwtUtil jwtUtil;

    /**
     * @param orderDTO - Ordered book details
     * @return - Details of book purchased by user
     */
    @PostMapping
    public MyOrder addOrder(@RequestBody OrderDTO orderDTO, @RequestHeader("Authorization") String authenticate) {
        return iOrderService.addOrder(orderDTO, jwtUtil.extractUsername(authenticate.substring(7)));
    }

    /**
     * @param authenticate - JWT Token
     * @return All order details of user
     */
    @GetMapping
    public List<MyOrder> getAllOrders(@RequestHeader("Authorization") String authenticate) {
        return iOrderService.getAllOrders(jwtUtil.extractUsername(authenticate.substring(7)));
    }
}
