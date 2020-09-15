package com.mock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.dto.EventDTO;
import com.mock.dto.ParticipantDTO;
import com.mock.entity.Participant;
import com.mock.repository.EventRepository;
import com.mock.repository.ParticipantRepository;
@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private ParticipantRepository participantRepository;

	@Override
	public List<ParticipantDTO> getParticipantsByEventVenue(String venue) {
	      List<ParticipantDTO> participantDTO= new ArrayList<ParticipantDTO>();
	      System.out.println("here");
//		participantRepository.getParticipantsByEventVenue(venue).forEach(m->
//	                                    participantDTO.add(ParticipantDTO.prepareDTO(m)));
		
	
		return participantDTO;
	}

	@Override
	public ParticipantDTO registerParticipant(ParticipantDTO participantDTO) {
		
		return null;
	}

}
