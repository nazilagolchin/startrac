package com.startrac.dao;

import org.springframework.data.repository.CrudRepository;
import com.startrac.model.UnitOfMeasue;

public interface CategoryRepository extends CrudRepository<UnitOfMeasue, Long> {

}
