package com.startrac.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TRUCK")
public class Truck {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRUCK_SEQ")
	@SequenceGenerator(sequenceName = "truck_seq", name = "TRUCK_SEQ")
	Long id;

	String licencePlate;

	public Truck(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "truck",orphanRemoval=true)
	@JsonIgnore
	private List<Shipment> shipments;

	public List<Shipment> getShipments() {
		return shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	public Truck() {
	}

	@Override
	public String toString() {
		return "Truck [licencePlate=" + licencePlate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

}
