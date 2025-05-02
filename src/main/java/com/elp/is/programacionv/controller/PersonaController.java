package com.elp.is.programacionv.controller;

import com.elp.is.programacionv.controller.dto.PersonaRequest;
import com.elp.is.programacionv.controller.dto.PersonaResponse;
import com.elp.is.programacionv.controller.model.PersonaEntity;
import com.elp.is.programacionv.controller.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;

    @GetMapping("/persona")
    public String persona() {
        return "Hola Mundo";
    }

    /*GetMapping("/personas")
    public List<Persona> personaList() {
        return personas();
    }*/

    @PostMapping("/guardar/persona")
    public List<PersonaRequest> guardarPersona(@RequestBody PersonaRequest persona) {
        List<PersonaRequest> listPersona = new ArrayList<>();
        listPersona.add(persona);

        return listPersona;
    }
    
    @GetMapping("/persona/all")
    public List<PersonaEntity> personaAll() {

        return personaService.findPersona();
    }
    
    
    @PostMapping("/nombre/persona")
    public PersonaResponse guardarPersonaUnica(@RequestBody PersonaRequest persona) {
    	PersonaResponse respuesta = new PersonaResponse();
    	respuesta.setNombreCompleto(persona.getNombre().concat(" ").concat(persona.getApellido()));

        return respuesta;
    }


}
