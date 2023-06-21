package com.sk.service;

import java.util.List;

import com.sk.entity.Orders;
import com.sk.entity.Product;

public interface IOrderService {
	public String insert(Orders order);

	List<Product> bookPriceGt100();

	List<Product> toys10perDiscount();

}
