package net.codejava.service;

import net.codejava.models.Order;
import net.codejava.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public void saveOrder(Order order){
        order.setOrder_date(new Date());
        repository.save(order);
    }
    public List<Order>getOrdersById(Long id){
         return repository.getUserOrders(id);
    }


}
