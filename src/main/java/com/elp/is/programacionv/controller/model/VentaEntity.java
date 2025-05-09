package com.elp.is.programacionv.controller.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "VENTA")
public class VentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private PersonaEntity persona;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductoEntity producto;


}
