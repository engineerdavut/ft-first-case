package com.example.backenddemo.dto;

import lombok.Data;

@Data
public class UserCreateDTO {
	
	//@Size(min=4,max=32,message="firstname4-32 harf arası olmalı.")
	private String firstName;
	private String lastName;
	//private boolean active=true;

}
