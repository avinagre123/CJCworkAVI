package com.infy.springbootrestapicrudappProductSupplier.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Product;
import com.infy.springbootrestapicrudappProductSupplier.app.entity.Supplier;
import com.infy.springbootrestapicrudappProductSupplier.app.servicei.SupplierServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class SupplierController {

	@Autowired
	SupplierServiceI ss;
	
	@PostMapping("/supplier")
	public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier s)
	{
		 Supplier supply = ss.saveSupply(s);
		return new ResponseEntity<Supplier>(supply,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllSupplier")
	public Iterable<Supplier> getAllData()
	{
		Iterable<Supplier> allData = ss.getAllData();
		
	return allData;
	}
	

	
	
	
}
