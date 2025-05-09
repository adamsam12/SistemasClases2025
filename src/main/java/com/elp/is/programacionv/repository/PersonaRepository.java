package com.elp.is.programacionv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elp.is.programacionv.model.PersonaEntity;

//@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

}
