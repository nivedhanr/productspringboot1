package com.example.productbackend2.dao;

import com.example.productbackend2.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}
