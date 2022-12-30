package com.infy.springbootrestapicrudappProductSupplier.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudappProductSupplier.app.entity.Product;
import com.infy.springbootrestapicrudappProductSupplier.app.entity.Supplier;
import com.infy.springbootrestapicrudappProductSupplier.app.repo.ProductRepository;
import com.infy.springbootrestapicrudappProductSupplier.app.repo.SupplierRepository;
import com.infy.springbootrestapicrudappProductSupplier.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI {
	
	@Autowired
	ProductRepository pr;
	

	@Override
	public Product savePro(Product p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}


	@Override
	public Iterable<Product> getAllData() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}


	@Override
	public Optional<Product> getSingleData(Integer pid) {
		// TODO Auto-generated method stub
		return pr.findByProductId(pid);
	}


	@Override
	public void deleteData(Integer pid) {
		// TODO Auto-generated method stub

		pr.deleteById(pid);
		
	}


	

	

}
