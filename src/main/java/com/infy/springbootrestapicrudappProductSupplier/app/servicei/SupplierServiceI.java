package com.infy.springbootrestapicrudappProductSupplier.app.servicei;

import java.util.Optional;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Product;
import com.infy.springbootrestapicrudappProductSupplier.app.entity.Supplier;

public interface SupplierServiceI {

	Supplier saveSupply(Supplier s);

	Iterable<Supplier> getAllData();

	
}
