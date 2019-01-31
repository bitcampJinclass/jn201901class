package com.bitcamp.mvc;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order/order")
public class OrderController {

	@RequestMapping(method = RequestMethod.GET)
	public String getOrderForm() {

		return "order/orderForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String order(@ModelAttribute("orders") OrderCommand command) {

		System.out.println(command.getOrderItems());
		System.out.println(command.getAddress());

		return "order/order";
	}
	
	
	
	
	
	
	

}
