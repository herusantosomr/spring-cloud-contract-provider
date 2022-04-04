package com.hackathon.avengers.controller;

import javax.validation.Valid;

import com.hackathon.avengers.dto.IdDTO;
import com.hackathon.avengers.entity.User;
import com.hackathon.avengers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avengers/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<IdDTO> createUser(@RequestBody @Valid User user) {
		return ResponseEntity
				.status(201)
				.body(userService.createUser(user));
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<IdDTO> updateUser(@RequestBody @Valid User user, @PathVariable long id) {
		return ResponseEntity.ok(userService.updateUser(id, user));
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		return ResponseEntity.ok(userService.getById(id));
	}

}
