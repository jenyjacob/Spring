package com.infy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Mentor;

public interface MentorRepository extends CrudRepository<Mentor,Integer> {
	 List<Mentor> findByNumberOfProjectsMentored(Integer numberOfProjectsMemtored);

}
