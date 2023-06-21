package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders,Long> {
	

}
