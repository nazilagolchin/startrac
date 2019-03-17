package com.startrac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.startrac.model.Truck;

public interface TruckRepository extends CrudRepository<Truck, Long> {

	List<Truck> findBylicencePlate(String licencePlate);

	@Query("select c from Truck c inner join Shipment s on c.id=s.truck inner join UnitOfMeasue u on u.id=s.unitOfMeasue where u.id = :unitId")
	List<Truck> findByWithShipsUnit(@Param("unitId") Long unitId);

	@Query("select c from Truck c inner join Shipment s on c.id=s.truck inner join UnitOfMeasue u on u.id=s.unitOfMeasue where u.description like :unitDesc")
	List<Truck> findByWithShipsUnitDesc(@Param("unitDesc") String unitDesc);

	@Query("select c from Truck c inner join Shipment s on c.id=s.truck inner join ShipmentCategory u on u.shipment=s.id"
			+ " inner join Category ca on ca.id=u.category where ca.id = :categoryId")
	List<Truck> findByWithShipsCategory(@Param("categoryId") Long categoryId);

	@Query("select c from Truck c inner join Shipment s on c.id=s.truck inner join ShipmentCategory u on u.shipment=s.id"
			+ " inner join Category ca on ca.id=u.category where ca.description like :categoryDesc")
	List<Truck> findByWithShipsCategoryDesc(@Param("categoryDesc") String categoryDesc);

	

}
