package com.infy.springbootrestapicrudappProductSupplier.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Supplier;
import com.infy.springbootrestapicrudappProductSupplier.app.repo.SupplierRepository;
import com.infy.springbootrestapicrudappProductSupplier.app.servicei.SupplierServiceI;


@Service
public class SupplierServiceImpl implements SupplierServiceI {

	@Autowired
	SupplierRepository sr;
	
	@Override
	public Supplier saveSupply(Supplier s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public Iterable<Supplier> getAllData() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	
}
