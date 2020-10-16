package com.ufes.adminufes;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ufes.adminufes.domain.User;
import com.ufes.adminufes.domain.security.Role;
import com.ufes.adminufes.domain.security.UserRole;
import com.ufes.adminufes.service.UserService;
import com.ufes.adminufes.utility.SecurityUtility;

@SpringBootApplication
public class AdminufesApplication implements CommandLineRunner{
	
	@Autowired
	
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(AdminufesApplication.class, args);
	}

	@Override
	public void run(String...args ) throws Exception {
		
		User user1= new User();		
		user1.setUsername("adminufes");
		user1.setPassword(SecurityUtility.passowrdEncoder()
				.encode("admin"));
		user1.setEmail("adminufes@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(0);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
	}
	
	
}
