package com.startrac.dao;

import org.springframework.data.repository.CrudRepository;
import com.startrac.model.UnitOfMeasue;

public interface ShipmentRepository extends CrudRepository<UnitOfMeasue, Long> {

}
