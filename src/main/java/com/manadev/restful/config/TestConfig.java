package com.manadev.restful.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.manadev.restful.entities.Order;
import com.manadev.restful.entities.User;
import com.manadev.restful.entities.enums.OrderStatus;
import com.manadev.restful.repositories.OrderRepository;
import com.manadev.restful.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Mary Brown", "mary@email.com", "999888777", "123456");
		User u2 = new User(null, "Bob Wallet", "bob@email.com", "888777666", "123456");

		Order o1 = new Order(null, Instant.parse("2021-02-12T14:41:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2021-01-12T14:10:07Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2021-02-12T14:22:07Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
}
