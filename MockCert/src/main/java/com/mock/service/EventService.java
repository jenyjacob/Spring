package com.mock.service;

import java.util.List;

import com.mock.dto.ParticipantDTO;

public interface EventService {
	
	public List<ParticipantDTO> getParticipantsByEventVenue(String venue);
	
	public ParticipantDTO registerParticipant(ParticipantDTO participantDTO);

}
