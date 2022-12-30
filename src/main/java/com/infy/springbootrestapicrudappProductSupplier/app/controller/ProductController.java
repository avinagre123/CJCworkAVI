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
import com.infy.springbootrestapicrudappProductSupplier.app.servicei.ProductServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductServiceI ps;
	
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p)
	{
		 Product savePro = ps.savePro(p);
		return new ResponseEntity<Product>(savePro,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getAll")
	public Iterable<Product> getAllData()
	{
		Iterable<Product> allData = ps.getAllData();
		
	return allData;
	}
	
	@GetMapping("/getsingle/{pid}")
	public ResponseEntity<Optional<Product>> getSingleData(@PathVariable("pid") Integer pid )
	{
		
		Optional<Product> singleData = ps.getSingleData(pid);
		return new ResponseEntity<Optional<Product>>(singleData, HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{pid}")
	public ResponseEntity<Optional<Product>> updateData(@RequestBody Product p,@PathVariable("pid") Integer pid)
	{
		Optional<Product> data = ps.getSingleData(pid);
		
		if(data.isPresent())
		{
			Product pp=ps.savePro(p);
			
			return new ResponseEntity<Optional<Product>>(data, HttpStatus.CREATED);
		}
		else {
				return new ResponseEntity<Optional<Product>>(data, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<Optional<Product>> deleteData(@PathVariable("pid")Integer pid)
	{
		Optional<Product> del = ps.getSingleData(pid);
		if(del.isPresent())
		{
			ps.deleteData(pid);
			return new ResponseEntity<Optional<Product>>(del, HttpStatus.OK);
		}
		
		return new ResponseEntity<Optional<Product>>(del, HttpStatus.OK) ;
		
	}
	
	
}
