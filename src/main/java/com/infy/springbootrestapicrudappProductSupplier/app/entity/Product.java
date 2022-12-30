package com.infy.springbootrestapicrudappProductSupplier.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Double productPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
}
