package com.infy.dto;

public class MentorDTO {
	
	private Integer mentorId;
	private String mentorName;
	private Integer numberOfProjectsMentored;
	
	public MentorDTO() {
		super();
		
	}
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public Integer getNumberOfProjectsMentored() {
		return numberOfProjectsMentored;
	}
	public void setNumberOfProjectsMentored(Integer numberOfProjectsMentored) {
		this.numberOfProjectsMentored = numberOfProjectsMentored;
	}
	

}
