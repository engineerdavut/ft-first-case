package com.example.backenddemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor //All yapmadık.
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name", nullable=false ,length=50)
	private String firstName;
	@Column(name="last_name", nullable=false ,length=50)
	private String lastName;
	@Column(name="email", nullable=false ,length=50)
	private String email;
	@Column(name="phone", nullable=false ,length=15)
	private String phone;
	public User(String firstName, String lastName,String email,String Phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	//console log h2-consoleda default database ismi

}
