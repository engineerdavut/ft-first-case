package com.example.backenddemo.dto;

import lombok.Data;

@Data
public class UserUpdateDTO {
	//create aynı olmama sebebi farkli tc no gibi degistirilemez fieldlar olabilir.
	private String firstName;
	private String lastName;

}
