package com.startrac.model;

import javax.persistence.*;

@Entity
public class UnitOfMeasue {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UNITOFMEASUE_SEQ")
	@SequenceGenerator(sequenceName = "UnitOfMeasue_seq", name = "UNITOFMEASUE_SEQ")
	Long id;

	String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UnitOfMeasue(String description) {
		this.description = description;
	}

	public UnitOfMeasue() {
	}

	@Override
	public String toString() {
		return "UnitOfMeasue [description=" + description + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
