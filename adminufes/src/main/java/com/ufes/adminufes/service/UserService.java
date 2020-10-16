package com.ufes.adminufes.service;

import java.util.Set;

import com.ufes.adminufes.domain.User;
import com.ufes.adminufes.domain.security.UserRole;



public interface UserService {
	
   
   User createUser(User user, Set<UserRole> userRoles)throws Exception ;
   
   User save(User user);

}
