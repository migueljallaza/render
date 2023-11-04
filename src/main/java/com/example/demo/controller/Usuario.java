package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
//@CrossOrigin(origins = "https://mike2023.netlify.app")
@CrossOrigin(origins = "http://localhost:8080") 
@RequestMapping("/user/")
public class Usuario {

    @Autowired
    UserRepository userRepository;

    @GetMapping("count-users")
	public String getCountUsers(){
		long numberUsers = userRepository.count();
		return "Cantidad de Usuarios : "+numberUsers;
	}

	@GetMapping("add-user")
	public String addUser(){
		User user = new User();
		user.setFirstName("Render");
		user.setLastName("Spring Boot");
		userRepository.save(user);
		return "item adicionado!!!!!";
	}

    @GetMapping("list-user")
    public List<User> showAllJobs() {
        return userRepository.findAll(Sort.by("id").descending());
    }

	@PostMapping("add")
    public ResponseEntity<User> showSaveJobs(@RequestBody User user) {
        return new ResponseEntity<User>(userRepository.save(user), HttpStatus.CREATED);
    }
    
}
