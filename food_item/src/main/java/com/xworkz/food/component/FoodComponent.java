package com.xworkz.food.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FoodComponent {
	
	
	public FoodComponent() {
System.out.println("created"+getClass().getSimpleName());	
}
	@GetMapping
	public String onSend(@RequestParam String name,@RequestParam String type,@RequestParam int quantity,@RequestParam int price) {
		System.out.println("Running onSend method");
		System.out.println("name"+name);
		System.out.println("type"+type);
		System.out.println("quantity"+quantity);
		System.out.println("price"+price);
		return "FoodItem.jsp";
	}

}
