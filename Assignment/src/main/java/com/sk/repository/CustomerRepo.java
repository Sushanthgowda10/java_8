package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
