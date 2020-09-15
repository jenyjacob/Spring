package com.mock.dto;

import java.time.LocalDate;

import com.mock.entity.Events;

public class EventDTO {
	
	private Integer eventId;
	private String name;
	private LocalDate eventDate;
	private String venue;
	private Integer maxCount;
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Integer getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}
	
	public static EventDTO prepareDTO(Events events) {
		EventDTO eventDTO = new EventDTO();
		eventDTO.setEventDate(events.getEventDate());
		eventDTO.setEventId(events.getEventId());
		eventDTO.setMaxCount(events.getMaxCount());
        eventDTO.setName(events.getName());
        eventDTO.setVenue(events.getVenue());
		return eventDTO;
	}

}
