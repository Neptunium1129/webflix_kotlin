package com.ksm.wfx.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Item() {}
	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", updatable=false, nullable=false)
	private Long id;

	@Column(name="name", updatable=false, nullable=false)
	private String name;
	
	@Column(name="price", updatable=false, nullable=false)
	private int price;
	
	
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
