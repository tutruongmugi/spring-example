package com.ecommerce.demo;

import com.ecommerce.demo.models.role.Role;
import com.ecommerce.demo.models.user.User;
import com.ecommerce.demo.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	CommandLineRunner run(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(1,"ROLE_USER"));
//			userService.saveRole(new Role(2,"ROLE_ADMIN"));
//			userService.saveRole(new Role(3,"ROLE_SHOPPER"));
//
//			userService.saveUser(new User(1,"tu","tu","123456",new ArrayList<>()));
//			userService.saveUser(new User(2,"truong","truong","123456",new ArrayList<>()));
//			userService.saveUser(new User(3,"quang","quang","123456",new ArrayList<>()));
//
//			userService.addRoleToUser("tu","ROLE_USER");
//			userService.addRoleToUser("tu","ROLE_SHOPPER");
//			userService.addRoleToUser("truong","ROLE_ADMIN");
//			userService.addRoleToUser("quang","ROLE_ADMIN");
//		};
//	}
}
