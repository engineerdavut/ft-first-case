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
@Table(name="productyorum")
public class ProductYorum {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="yorum", nullable=false ,length=500)
	private String yorum;
	@Column(name="yorumdate", nullable=false )
	private Date yorumdate;
	@Column(name="productId", nullable=false )
	private Long productId;
	@Column(name="userId", nullable=false )
	private Long userId;

	public ProductYorum(String yorum, Date yorumdate,Long productId,Long userId) {
		this.yorum = yorum;
		this.yorumdate=yorumdate;
		this.productId = productId;
		this.userId = userId;
	}
	//console log h2-consoleda default database ismi

}
