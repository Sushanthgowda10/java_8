package com.sk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PRODUCT")
@Data

public class Product {
	@Id
	@GeneratedValue
	@Column(name = "PID")
	private long pid;

	@Column(name = "PRODUCT_NAME",length = 20)
	private String productName;

	@Column(name = "PRODUCT_CATEGORY",length = 20)
	private String category;

	@Column(name = "PRICE")
	private Double price;

}