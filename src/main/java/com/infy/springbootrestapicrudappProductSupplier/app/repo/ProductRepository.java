package com.infy.springbootrestapicrudappProductSupplier.app.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	Optional<Product> findByProductId(Integer pid);

}
