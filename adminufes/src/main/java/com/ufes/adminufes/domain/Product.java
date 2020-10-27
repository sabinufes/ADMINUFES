package com.ufes.adminufes.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String brand;
	private String collection; 
	private String size;
	private String sex;
	private String category;
	private double listPrice;
	private double price;
	private boolean active=true;
	
	
	

	private int inStockNumber;
	
	@Transient
	private MultipartFile productImage;
	
	
	@OneToMany(mappedBy = "product")
	@JsonIgnore
	private List<ProductToCartItem> productToCartItem;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInStockNumber() {
		return inStockNumber;
	}

	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	@Column(columnDefinition="text")
	private String description;
	public List<ProductToCartItem> getProductToCartItem() {
		return productToCartItem;
	}

	public void setProductToCartItem(List<ProductToCartItem> productToCartItem) {
		this.productToCartItem = productToCartItem;
	}
	

}
