package com.whit33th.azure.redshop.repository;

import com.whit33th.azure.redshop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    //
}
