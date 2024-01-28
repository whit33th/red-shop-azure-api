package com.whit33th.azure.redshop.repository;

import com.whit33th.azure.redshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    //
}
