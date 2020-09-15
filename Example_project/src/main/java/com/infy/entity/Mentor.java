package com.infy.entity;

public class Mentor {

	private Integer mentorId;
	private String mentorName;
	private Integer numberOfProjectsMentored;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mentorId == null) ? 0 : mentorId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mentor other = (Mentor) obj;
		if (mentorId == null) {
			if (other.mentorId != null)
				return false;
		} else if (!mentorId.equals(other.mentorId))
			return false;
		return true;
	}
	
}
