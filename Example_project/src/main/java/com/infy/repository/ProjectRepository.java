package com.infy.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
	
	List<Project> findByIdeaOwner(Integer ideaOwner);

}
