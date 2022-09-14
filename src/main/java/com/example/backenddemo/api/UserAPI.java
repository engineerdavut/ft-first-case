package com.example.backenddemo.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backenddemo.dto.UserCreateDTO;
import com.example.backenddemo.dto.UserUpdateDTO;
import com.example.backenddemo.dto.UserViewDTO;
import com.example.backenddemo.service.UserService;
import com.example.backenddemo.shared.GenericResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserAPI {
	private final UserService userService;
	/*
	public UserAPI(UserService userService) {
		super();
		this.userService = userService;
	}
	//RequiredArgsConstructor
	*/
	@GetMapping("v1/user/{id}")//link
	public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id){
		final UserViewDTO user=userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
	/*
	public ResponseEntity<?> getUserById(@PathVariable Long Id){
		
	}
	*/
	@GetMapping("v1/user")
	public ResponseEntity<List<UserViewDTO>> getUsers(){
		final List<UserViewDTO> users=userService.getUsers();
		return ResponseEntity.ok(users);		
	}
	@PostMapping("v1/user")
	public ResponseEntity<?> createUser(@RequestBody UserCreateDTO userCreateDTO){
		userService.createUser(userCreateDTO);
		return ResponseEntity.ok(new GenericResponse("Kullanici olusturuldu."));
	}
	@PutMapping("v1/user/{id}")
	public ResponseEntity<UserViewDTO> updateUser(@PathVariable("id") Long id /* ,@Valid */,@RequestBody UserUpdateDTO userUpdateDTO){
		//return ResponseEntity.ok(new GenericResponse("Kullanici guncellendi."));
		final UserViewDTO user=userService.updateUser(id,userUpdateDTO);
		return ResponseEntity.ok(user);
	}

}
