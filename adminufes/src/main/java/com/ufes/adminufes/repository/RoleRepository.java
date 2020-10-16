package com.ufes.adminufes.repository;

import org.springframework.data.repository.CrudRepository;

import com.ufes.adminufes.domain.security.Role;



public interface RoleRepository extends CrudRepository<Role, Long> {
Role findByName(String name);

}
