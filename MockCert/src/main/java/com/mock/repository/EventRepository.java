package com.mock.repository;

import org.springframework.data.repository.CrudRepository;

import com.mock.entity.Events;

public interface EventRepository extends CrudRepository<Events, Integer> {
	
	Events findByName (String name);

}
