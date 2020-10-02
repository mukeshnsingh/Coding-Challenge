package com.eurekaclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eurekaclient.entity.OrderService;

public interface OrderServiceRepo extends JpaRepository<OrderService, Long>{

}
