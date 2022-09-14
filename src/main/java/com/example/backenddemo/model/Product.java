package com.example.backenddemo.model;

import java.util.Date;

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
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="name", nullable=false ,length=50)
	private String name;
	@Column(name="price", nullable=false )
	private Double price;
	@Column(name="date", nullable=false )
	private Date date;

	public Product(String name, Double price,Date date) {
		this.name = name;
		this.price = price;
		this.date = date;
	}
	//console log h2-consoleda default database ismi

}
