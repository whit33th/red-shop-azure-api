package com.whit33th.azure.redshop.repository;

import com.whit33th.azure.redshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    //
}
