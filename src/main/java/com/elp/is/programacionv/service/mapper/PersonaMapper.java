package com.elp.is.programacionv.service.mapper;

import com.elp.is.programacionv.controller.dto.PersonaResponse;
import com.elp.is.programacionv.controller.dto.RequestPersona;
import com.elp.is.programacionv.model.PersonaEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonaMapper {

    public PersonaEntity toPersonaEntity(RequestPersona persona) {

        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setApellido1(persona.apellido1());
        personaEntity.setApellido2(persona.apellido2());
        personaEntity.setNombre(persona.nombre());
        personaEntity.setDni(persona.dni());

        personaEntity.setSexo(persona.sexo() != null && persona.sexo() == 1? "M": "F");

        return personaEntity;
    }

    public PersonaResponse mapToPersonaResponse(PersonaEntity personaEntity) {
        return null;
    }

}
