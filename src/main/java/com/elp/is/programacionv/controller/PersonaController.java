package com.elp.is.programacionv.controller;

import com.elp.is.programacionv.controller.dto.PersonaRequest;
import com.elp.is.programacionv.controller.dto.PersonaResponse;
import com.elp.is.programacionv.controller.dto.RequestPersona;
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

    //Guarda en la BD lo que viene definido en el Request (persona)
    @PostMapping("/guardar/persona")
    public void guardarPersona(@RequestBody RequestPersona persona) {
        personaService.savePersona(persona);
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
    
    @GetMapping ("personsa/{id}")
    public PersonaResponse personaPorId(@PathVariable Long id) {
        return personaService.findPersonaById(id);
    }




}
