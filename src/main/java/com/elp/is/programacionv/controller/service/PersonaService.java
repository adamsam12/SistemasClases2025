package com.elp.is.programacionv.controller.service;

import java.util.List;

import com.elp.is.programacionv.controller.dto.PersonaResponse;
import com.elp.is.programacionv.controller.model.PersonaEntity;

public interface PersonaService {
	
	List<PersonaEntity> findPersona();

}
