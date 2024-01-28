package com.whit33th.azure.redshop.repository;

import com.whit33th.azure.redshop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    //
}
