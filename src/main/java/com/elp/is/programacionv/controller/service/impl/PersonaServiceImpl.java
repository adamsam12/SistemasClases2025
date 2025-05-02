package com.elp.is.programacionv.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elp.is.programacionv.controller.model.PersonaEntity;
import com.elp.is.programacionv.controller.repository.PersonaRepository;
import com.elp.is.programacionv.controller.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<PersonaEntity> findPersona() {
		
		List<PersonaEntity> personaEntity = personaRepository.findAll(); 
		
		return personaEntity;
	}

}
