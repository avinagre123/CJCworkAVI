package com.infy.springbootrestapicrudappProductSupplier.app.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer> {


}
