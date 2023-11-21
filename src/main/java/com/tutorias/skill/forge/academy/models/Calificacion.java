package com.tutorias.skill.forge.academy.models;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "calificaciones")
@Entity
@ToString
@EqualsAndHashCode
public class Calificacion {

        @Id
        @Getter @Setter
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "tutor_id")
        @Getter @Setter
        private Tutor tutor;

        @ManyToOne
        @JoinColumn(name = "estudiante_id")
        @Getter @Setter
        private Usuario estudiante;

        @Getter @Setter
        private int puntuacion;

        @Getter @Setter
        private String comentario;
}

