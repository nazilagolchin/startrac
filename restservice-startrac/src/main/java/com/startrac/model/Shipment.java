package com.startrac.model;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@OnDelete(action = OnDeleteAction.CASCADE)
@Table(name="SHIPMENT")
public class Shipment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHIPMENT_SEQ")
	@SequenceGenerator(sequenceName = "Shipment_seq", name = "SHIPMENT_SEQ")
	private Long id;

	private String shipmentNumber;
	private Double amount;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "unitOfMeasue_id", nullable = false)
	private UnitOfMeasue unitOfMeasue;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "truck_id", nullable = false)
	private Truck truck;

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}

	public UnitOfMeasue getUnitOfMeasue() {
		return unitOfMeasue;
	}

	public void setUnitOfMeasue(UnitOfMeasue unitOfMeasue) {
		this.unitOfMeasue = unitOfMeasue;
	}

	public String getShipmentNumber() {
		return shipmentNumber;
	}

	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Shipment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
