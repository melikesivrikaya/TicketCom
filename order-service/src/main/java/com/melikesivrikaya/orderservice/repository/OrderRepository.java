package com.melikesivrikaya.orderservice.repository;

import com.melikesivrikaya.orderservice.model.Order;
import com.melikesivrikaya.orderservice.model.TicketForOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
