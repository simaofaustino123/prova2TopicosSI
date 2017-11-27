package br.edu.univas.si8.ta.shopping.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.shopping.api.OrderService;
import br.edu.univas.si8.ta.shopping.ejb.interfaces.Order;

@RequestScoped
public class OrderServiceImpl implements OrderService {
	
	@EJB(mappedName = "java:app/shopping-ejb-0.1-SNAPSHOT/OrderBean!br.edu.univas.si8.ta.order.ejb.interfaces.OrderRemote")
	private Order order; 

	@Override
	public String[] listProductDescription() {
		return order.listProductDescription();
	}

	@Override
	public String saveNewProduct(String description) {
		order.createNewProduct(description);
		return "{\"message\": \"Success\"}";
	}

}
