package com.projetos.product_system.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.product_system.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
<<<<<<< HEAD

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Fred", "fredabreu86@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u);
	}
=======
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Fred", "fredabreu86@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

>>>>>>> 01287a7 (Banco de dados H2, TEST profile e JPA)
}
