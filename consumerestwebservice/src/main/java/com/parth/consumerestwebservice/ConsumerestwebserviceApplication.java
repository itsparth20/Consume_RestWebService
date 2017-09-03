package com.parth.consumerestwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.parth.consumerestwebservice.vo.Restaurant;

@SpringBootApplication
public class ConsumerestwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerestwebserviceApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		Restaurant res = restTemplate.getForObject("https://davids-restaurant.herokuapp.com/menu_items.json", Restaurant.class);
		System.out.println(res.toString());
	}	
}
