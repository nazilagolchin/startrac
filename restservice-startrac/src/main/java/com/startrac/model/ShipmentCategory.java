package com.startrac.model;

import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@OnDelete(action = OnDeleteAction.NO_ACTION)
@Table(name="SHIPMENT_CATEGORY")
public class ShipmentCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHIPMENTCATEGORY_SEQ")
	@SequenceGenerator(sequenceName = "ShipmentCategory_seq", name = "SHIPMENTCATEGORY_SEQ")
	private Long id;

	@OneToOne(fetch = FetchType.EAGER,orphanRemoval=true,cascade=CascadeType.PERSIST)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	@OneToOne(fetch = FetchType.EAGER,orphanRemoval=true,cascade=CascadeType.PERSIST)
	@JoinColumn(name = "shipment_id", nullable = false)
	private Shipment shipment;

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ShipmentCategory() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
