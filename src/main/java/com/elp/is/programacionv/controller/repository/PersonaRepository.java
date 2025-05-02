package com.elp.is.programacionv.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elp.is.programacionv.controller.model.PersonaEntity;

//@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
