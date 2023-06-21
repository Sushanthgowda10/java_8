package com.sk.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.entity.Customer;
import com.sk.entity.Orders;
import com.sk.entity.Product;
import com.sk.repository.CustomerRepo;
import com.sk.repository.OrderRepo;
import com.sk.repository.ProductRepo;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private OrderRepo orepo;

	@Autowired
	private ProductRepo prepo;

	@Autowired
	private CustomerRepo crepo;

	public String insert(Orders order) {
		List<Product> Plist = new ArrayList<Product>();

		Optional<Customer> Id = crepo.findById(order.getCustomer().getId());
		if (Id.isPresent()) {
			order.setCustomer(Id.get());
			order.setDeliveyDate(LocalDate.now());

			order.setOrderDate(LocalDate.now());

			List<Product> listOfProducts = new ArrayList<>();

			Plist.forEach(i -> listOfProducts.add(prepo.findById(i.getPid()).get()));

			order.setProducts(listOfProducts);

			order.setStatus("ok");

			orepo.save(order);

			return "inserted succesfully:";

		}

		return "not inserted";

	}
	
	@Override
	public List<Product> bookPriceGt100() {
		
		List<Product> product = prepo.findAll();
		List<Product> list =product.stream()
				
				.filter(a->a.getCategory().equalsIgnoreCase("Books") && a.getPrice() > 100).toList();
		return list;
		
	}	
			@Override
			public List <Product> toys10perDiscount() {
				List<Product> product = prepo.findAll();
				List<Product> collect =product.stream().filter(a->a.getCategory().equalsIgnoreCase("Toys"))
						.map(p->{p.setPrice(p.getPrice()-(p.getPrice()*0.1));
				
						return p;
						}).collect(Collectors.toList());
						return collect;
			}
				
	
}	
			
			System.out.println("!!!!!!!Question 4!!!!!!!!");

			List<order> listOfOrders4 = service.listOfOrders();

			List<order> collect4 = listOfOrders4.stream()

			.filter(c -> c.getCustomer().getTier() == 2 && c.getOrderDate().isAfter(LocalDate.of(2021, 02, 01))

			&& c.getDeliveryDate().isBefore(LocalDate.of(2021, 04, 01)))

			.collect(Collectors.toList());

			System.out.println(collect4);

			
			
			
			
			
			
			
			System.out.println("!!!!!!!Question 5!!!!!!!!");


			List<Product> listOfProduct3 = service.listOfProduct();

			Optional<Product> filter = listOfProduct3.stream().filter(p -> p.getCategory().equalsIgnoreCase("Books"))

			.min(Comparator.comparing(Product::getPrice));

			System.out.println(filter);
			
			
			System.out.println("!!!!!!!Question 6!!!!!!!!");

			List<Order> listOfOrders2 = service.listOfOrders();

			List<Order> collect3 = listOfOrders2.stream().sorted(Comparator.comparing(Order::getOrderDate).reversed())

			.limit(3).collect(Collectors.toList());

			collect3.forEach((p) -> {

			System.out.println(p.toString());

			});

			

			System.out.println("!!!!!!!Question 7!!!!!!!!");

			

			

			System.out.println("!!!!!!!Question 8!!!!!!!!");

			List<Order> listOfOrders7 = service.listOfOrders();

			long count3 = listOfOrders7.stream().filter(f -> f.getOrderDate().isEqual(LocalDate.of(2021, 02, 01)))

			.map(m -> m.getOrder_id()).collect(Collectors.toList()).stream().count();

			System.out.println(count3);

			System.out.println("!!!!!!!Question 9!!!!!!!!");
			
			
			
			System.out.println("!!!!!!!Question 10!!!!!!!!");

			List<Product> listOfProduct10 = service.listOfProduct();

			DoubleSummaryStatistics stat = listOfProduct10.stream().filter(ls -> ls.getCategory().equalsIgnoreCase("books"))

			.mapToDouble(x -> x.getPrice()).summaryStatistics();

			System.out.println("Sum : " + stat.getSum());

			System.out.println("Avg : " + stat.getAverage());

			System.out.println("Max : " + stat.getMax());

			System.out.println("Min : " + stat.getMin());

			System.out.println("Count : " + stat.getCount());

			 

			System.out.println("=====Question 11=======");

			listOfOrders

			.stream().collect(Collectors.toMap(i -> i.getOrder_id(), o -> o.getProducts().size())).entrySet().stream()

			 

			.toList().forEach(System.out::println);
			
	
	

}
