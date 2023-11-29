package com.tutorias.skill.forge.academy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "calificaciones")
@Entity
public class Calificacion {

        @Id
        @Getter @Setter
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "tutor_id")
        @Getter @Setter
        private PerfilTutor perfilTutor;

        @ManyToOne
        @JoinColumn(name = "estudiante_id")
        @Getter @Setter
        private Usuario estudiante;

        @Getter @Setter
        private int puntuacion;

        @Getter @Setter
        private String comentario;
}

