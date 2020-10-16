package com.ufes.adminufes.repository;

import org.springframework.data.repository.CrudRepository;

import com.ufes.adminufes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	
     User findByUsername(String username);

}
