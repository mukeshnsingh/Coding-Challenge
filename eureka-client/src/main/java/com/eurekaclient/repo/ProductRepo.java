package com.eurekaclient.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eurekaclient.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
