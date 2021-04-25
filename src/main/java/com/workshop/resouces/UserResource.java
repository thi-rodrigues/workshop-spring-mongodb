package com.workshop.resouces;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Silva", "maria@email.com");
		User alex = new User("2", "Alex Green", "alex@email.com");
		List<User> users = Arrays.asList(maria, alex);
		return ResponseEntity.ok().body(users);
	}
}
