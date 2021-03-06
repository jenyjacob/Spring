package com.mock.dto;

import java.time.LocalDate;


import com.mock.entity.Events;
import com.mock.entity.Participant;

public class ParticipantDTO {
	private Integer participantId;
	 private String name;
	 private String emailId;
	 private String gender;
	 private LocalDate registrationDate;
	 private Events event;
	public Integer getParticipantId() {
		return participantId;
	}
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Events getEvent() {
		return event;
	}
	public void setEvent(Events event) {
		this.event = event;
	}

	 public static Participant prepareEntity(ParticipantDTO participantDTO) {
		 Participant participant = new Participant();
		 participant.setEmailId(participantDTO.getEmailId());
		 participant.setName(participantDTO.getName());
		 participant.setGender(participantDTO.getGender());
		 participant.setRegistrationDate(participantDTO.getRegistrationDate());
		 return participant;
	 }
	 
	 public static ParticipantDTO prepareDTO (Participant participant) {
		 ParticipantDTO participantDTO = new ParticipantDTO();
		 participantDTO.setParticipantId(participant.getParticipantId());
		 participantDTO.setEmailId(participant.getEmailId());
		 participantDTO.setName(participant.getName());
		 participantDTO.setRegistrationDate(participant.getRegistrationDate());
		 return participantDTO;
	 }
	 
	 
}
