package com.company.task_b.service;

import com.company.task_b.model.Order;
import com.company.task_b.model.Product;
import com.company.task_b.model.TypeOfProduct;

import java.util.List;

public interface OrderService {
     Order newOrders();
     String deleteOrders();
     Order searchOrder(List<Order> orderList);
}
