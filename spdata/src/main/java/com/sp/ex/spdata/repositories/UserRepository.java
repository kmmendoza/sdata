package com.sp.ex.spdata.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sp.ex.spdata.models.User;

public interface UserRepository extends CrudRepository<User, Long>{

	List<User> findByName(String name);
	
	List<User> findByEmail(String email);
}
