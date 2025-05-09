package com.elp.is.programacionv.controller.dto;

public record RequestPersona(
        String nombre,
        String apellido1,
        String apellido2,
        String dni,
        Integer sexo
) {
}
