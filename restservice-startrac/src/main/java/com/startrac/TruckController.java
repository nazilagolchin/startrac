package com.startrac;

import java.awt.Menu;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.startrac.dao.TruckRepository;
import com.startrac.model.Truck;

@RestController
public class TruckController {

	private final TruckRepository repository;

	TruckController(TruckRepository repository) {
		this.repository = repository;
	}

	/*
	 * Service for get All the drives what contains shipments with a specific unit
	 * of measure
	 */
	@RequestMapping("/allDrivesWithUnit")
	public List<Truck> allDrivesWithUnit(@RequestParam(value = "unitId", defaultValue = "1") Long unitId) {

		return (List<Truck>) repository.findByWithShipsUnit(unitId);
	}

	/*
	 * Service for get All the drives what contains shipments with a specific unit
	 * of measure filter by measure description
	 */
	@RequestMapping("/allDrivesWithUnitDesc")
	public List<Truck> allDrivesWithUnitDesc(@RequestParam(value = "unitDesc", defaultValue = "1") String unitDesc) {

		return (List<Truck>) repository.findByWithShipsUnitDesc("%" + unitDesc + "%");
	}

	/*
	 * Service for All the drives what contains shipments what is in a specific
	 * category
	 */
	@RequestMapping("/allDrivesWithCategory")
	public List<Truck> allDrivesWithCategory(@RequestParam(value = "categoryId", defaultValue = "1") Long categoryId) {

		return (List<Truck>) repository.findByWithShipsCategory(categoryId);
	}

	/*
	 * Service for All the drives what contains shipments what is in a specific
	 * category filter by category description
	 */
	@RequestMapping("/allDrivesWithCategoryDesc")
	public List<Truck> allDrivesWithCategoryDesc(
			@RequestParam(value = "categoryDesc", defaultValue = "1") String categoryDesc) {

		return (List<Truck>) repository.findByWithShipsCategoryDesc("%" + categoryDesc + "%");
	}

	@PostMapping("/truckAdd")
	public ResponseEntity<?> save(@RequestBody Truck truck) {
		Truck truckAdd = repository.save(truck);
		return ResponseEntity.ok().body("New Truck has been saved with ID:" + truckAdd.getId());
	}

	@PutMapping("/truckUpdate/{id}")
	public ResponseEntity<Object> updatetruck(@RequestBody Truck truck, @PathVariable long id) {

		Optional<Truck> truckOptional = repository.findById(id);

		if (!truckOptional.isPresent())
			return ResponseEntity.notFound().build();

		truck.setId(id);

		repository.save(truck);

		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/truckDelete/{id}")
	public void deletetruck(@PathVariable long id) throws SQLIntegrityConstraintViolationException {

		Optional<Truck> truck = repository.findById(id);

		if (!truck.isPresent()) {
			return;
		}

		repository.deleteById(id);

	}
}
