package com.sk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.entity.Orders;
import com.sk.entity.Product;
import com.sk.service.IOrderService;

@RestController
@RequestMapping("/home")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	
	@GetMapping("/")
	
	public ResponseEntity<?>Home() {
		return new ResponseEntity<String>("welcome java 8",HttpStatus.OK);
		
	}
	@GetMapping("/createOrder")
	public ResponseEntity<?>CreateOrder(@RequestBody Orders orders){
		try {
			String body = orderService.insert(orders);
			return new ResponseEntity<String>(body,HttpStatus.OK);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return new ResponseEntity<String>("problem in inserting order",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
		
		@GetMapping("/creatGet100")
		public ResponseEntity<?> filterBook(){
			try {
				List<Product> bookprice=orderService.bookPriceGt100();
                return new ResponseEntity<List<Product>>(bookprice,HttpStatus.OK);
                 }catch(Exception e) {
                  e.printStackTrace();
                  return new ResponseEntity<String>("book not found",HttpStatus.INTERNAL_SERVER_ERROR);

		}
		}
		@GetMapping("/toys10perdiscount")

		public ResponseEntity<?> filtertoys(){
        try {
        List<Product> toys=orderService.toys10perDiscount();

		return new ResponseEntity<List<Product>>(toys,HttpStatus.OK);

		}catch(Exception e) {

		e.printStackTrace();

		return new ResponseEntity<String>("toys not found",HttpStatus.INTERNAL_SERVER_ERROR);

		}

		

		}

		
		
		
	
	
	
}
