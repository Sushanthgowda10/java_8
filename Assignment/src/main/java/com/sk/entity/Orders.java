package com.sk.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ORDERS")
@Data

public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Oid;

	@Column(name = "ORDER_STATUS", length = 20)
	private String status;

	@Column(name = "ORDER_DATE", length = 20)
	private LocalDate orderDate;

	@Column(name = "DELIVERY_DATE", length = 20)
	private LocalDate deliveyDate;

	@ManyToMany(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Person_id", referencedColumnName = "PID", nullable = false)
	private List<Product> products;

	@ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Customer_id", referencedColumnName = "CID", nullable = false)
	private Customer Customer;

}
