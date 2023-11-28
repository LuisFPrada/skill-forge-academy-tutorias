package com.tutorias.skill.forge.academy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Table(name = "sesiones_tutoria")
@Entity
public class Sesion_Tutorias {

        @Id
        @Getter @Setter
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "estudiante_id")
        @Getter @Setter
        private Usuario estudiante;

        @ManyToOne
        @JoinColumn(name = "tutor_id")
        @Getter @Setter
        private Perfiles_Tutores perfilesTutores;

        @JoinColumn(name = "nombre_tutoria")
        @Getter @Setter
        private String nombreTutoria;


        @Column(name = "fecha")
        @Getter @Setter
        private LocalDate fecha;

        @Column(name = "hora")
        @Getter @Setter
        private LocalTime hora;

        @Getter @Setter
        private boolean confirmada;


}