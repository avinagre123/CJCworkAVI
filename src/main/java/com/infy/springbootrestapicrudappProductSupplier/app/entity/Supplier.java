package com.infy.springbootrestapicrudappProductSupplier.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {

	@Id
	private Integer supplierId;
	private String supplierName;
	private Long supplierContact;
}
