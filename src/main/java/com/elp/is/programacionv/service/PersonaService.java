package com.elp.is.programacionv.service;

import java.util.List;

import com.elp.is.programacionv.controller.dto.PersonaResponse;
import com.elp.is.programacionv.controller.dto.RequestPersona;
import com.elp.is.programacionv.model.PersonaEntity;

public interface PersonaService {

	//Para el get
	List<PersonaEntity> findPersona();

	//Para el post
	void savePersona(RequestPersona persona);

	PersonaResponse findPersonaById(Long id);

	void updatePersona(RequestPersona persona);


}
