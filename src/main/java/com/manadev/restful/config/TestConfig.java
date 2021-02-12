package com.manadev.restful.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.manadev.restful.entities.User;
import com.manadev.restful.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Mary Brown", "mary@email.com", "999888777", "123456");
		User u2 = new User(null, "Bob Wallet", "bob@email.com", "888777666", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
