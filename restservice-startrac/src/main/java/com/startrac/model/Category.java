package com.startrac.model;

import javax.persistence.*;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_SEQ")
	@SequenceGenerator(sequenceName = "Category_seq", name = "CATEGORY_SEQ")
	Long id;
	
	String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category(String description) {
		this.description = description;
	}
	
	public Category() {
	}
	
	

	@Override
	public String toString() {
		return "Category [description=" + description + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}
