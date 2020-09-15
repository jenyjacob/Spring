package com.infy.dto;

import java.time.LocalDate;

public class ProjectDTO {
	private Integer projectId;
	private String projectName;
	private Integer ideaOwner;
	private LocalDate releaseDate;
	private MentorDTO mentorDTO;
	public ProjectDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Integer getIdeaOwner() {
		return ideaOwner;
	}
	public void setIdeaOwner(Integer ideaOwner) {
		this.ideaOwner = ideaOwner;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public MentorDTO getMentorDTO() {
		return mentorDTO;
	}
	public void setMentorDTO(MentorDTO mentorDTO) {
		this.mentorDTO = mentorDTO;
	}
	

}
