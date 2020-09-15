package com.mock.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.dto.ParticipantDTO;
import com.mock.service.EventService;

@RestController
@RequestMapping("api")
@Validated
@CrossOrigin
public class EventAPI {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping(value="events/{venue}")
	public ResponseEntity<List<ParticipantDTO>> getParticipantByEventVenue(@PathVariable String venue){
		List<ParticipantDTO> participantDTO= eventService.getParticipantsByEventVenue(venue);
		return new ResponseEntity<List<ParticipantDTO>>(participantDTO,HttpStatus.OK);
		
	}

}
