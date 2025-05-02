package com.elp.is.programacionv.controller.service.impl;

import java.util.List;
import java.util.Optional;

import com.elp.is.programacionv.controller.dto.PersonaResponse;
import com.elp.is.programacionv.controller.dto.RequestPersona;
import com.elp.is.programacionv.controller.service.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.is.programacionv.controller.model.PersonaEntity;
import com.elp.is.programacionv.controller.repository.PersonaRepository;
import com.elp.is.programacionv.controller.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private PersonaMapper personaMapper;
	
	@Override
	public List<PersonaEntity> findPersona() {
		List<PersonaEntity> personaEntity = personaRepository.findAll();
		return personaEntity;
	}

	@Override
	public void savePersona(RequestPersona persona) {
		personaRepository.save(personaMapper.toPersonaEntity(persona));
	}

	@Override
	public PersonaResponse findPersonaById(Long id) {
		Optional<PersonaEntity> personaEntity = personaRepository.findById(id);
		return null;
	}

}
