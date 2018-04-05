package com.sp.ex.spdata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sp.ex.spdata.dto.UserDto;
import com.sp.ex.spdata.models.User;
import com.sp.ex.spdata.repositories.UserRepository;

@Controller
@RequestMapping(path="/api/users")
public class UserController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping(path="/byName")
	public @ResponseBody Iterable<User> getUserByName(@RequestParam String name){
		return userRepo.findByName(name);
	}
	
	@PostMapping(path="/add")
	public @ResponseBody User add(@RequestBody UserDto u){
		return userRepo.save(new User(u.getEmail(), u.getName()));
	}
}


