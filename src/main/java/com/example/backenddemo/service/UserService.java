package com.example.backenddemo.service;

import java.util.List;

import com.example.backenddemo.dto.UserCreateDTO;
import com.example.backenddemo.dto.UserUpdateDTO;
import com.example.backenddemo.dto.UserViewDTO;

public interface UserService {
	
	UserViewDTO getUserById(Long id);

	UserViewDTO createUser(UserCreateDTO userCreateDTO);

	List<UserViewDTO> getUsers();

	UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

}
