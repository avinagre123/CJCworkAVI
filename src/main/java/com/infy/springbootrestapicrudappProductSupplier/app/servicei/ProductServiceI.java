package com.infy.springbootrestapicrudappProductSupplier.app.servicei;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Product;
import com.infy.springbootrestapicrudappProductSupplier.app.entity.Supplier;

public interface ProductServiceI {

Product savePro(Product p);



Iterable<Product> getAllData();



Optional<Product> getSingleData(Integer pid);



void deleteData(Integer pid);




}
