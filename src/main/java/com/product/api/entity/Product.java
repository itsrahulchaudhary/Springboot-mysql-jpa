package com.product.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_tab")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Price")
	private double price;
	

}
