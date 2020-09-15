package com.mock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mock.entity.Events;
import com.mock.entity.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Integer> {

	List<Participant> findByEvents (Events events);
	
	@Query( "select p from participant p join p.events e where e.venue=:venue")
	List<Participant> getParticipantsByEventVenue(@Param("venue")String venue);
	
}
