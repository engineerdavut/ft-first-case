package com.example.backenddemo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.backenddemo.dto.UserCreateDTO;
import com.example.backenddemo.dto.UserUpdateDTO;
import com.example.backenddemo.dto.UserViewDTO;
import com.example.backenddemo.exception.NotFoundException;
import com.example.backenddemo.model.User;
import com.example.backenddemo.repostory.UserRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor

public class UserServiceManager implements UserService{
	
	private final UserRepository userRepository;

	@Override
	public UserViewDTO getUserById(Long id) {
		// TODO Auto-generated method stub
		final User user=userRepository.findById(id).orElseThrow(()-> new NotFoundException("Not Found Exception"));
		return UserViewDTO.of(user);//önemli
	}

	@Override
	public UserViewDTO createUser(UserCreateDTO userCreateDTO) {
		final User user=userRepository.save(new User(userCreateDTO.getFirstName(),userCreateDTO.getLastName()));
		// TODO Auto-generated method stub
		return UserViewDTO.of(user);
	}

	@Override
	@Transactional(readOnly=true,propagation=Propagation.SUPPORTS)
	public List<UserViewDTO> getUsers() {
		// TODO Auto-generated method stub
		//bu yapıyı anla .metodlari
		return userRepository.findAll().stream().map(UserViewDTO::of).collect(Collectors.toList());
	}

	@Override
	public UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO) {
		// TODO Auto-generated method stub
		final User user=userRepository.findById(id).orElseThrow(()->new NotFoundException("Kullanici bulunamadi"));
		return null;
	}
	/*

	public UserServiceManager(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	*/
}