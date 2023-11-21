package com.tutorias.skill.forge.academy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Table(name = "sesiones_tutoria")
@Entity
public class Sesion_Tutoria {

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
        private Tutor tutor;

        @Column(name = "fecha")
        @Getter @Setter
        private LocalDateTime fecha;

        @Getter @Setter @Column(name = "confirmada")
        private boolean confirmada;


}
