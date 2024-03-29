package com.sis324.citas.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sis324.citas.service.UserService;
import com.sis324.citas.model.User;;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ArrayList<User> showUsers(){
		return userService.getUsers();
	}
	
	@PostMapping
	public User insert(@RequestBody User user){
		return userService.save(user);
	}
	
	@PutMapping
	public User edit(@RequestBody User user){
		return userService.save(user);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean delete(@PathVariable Long id){
		return userService.delete(id);
	}    
}
