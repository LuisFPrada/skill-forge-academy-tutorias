package com.tutorias.skill.forge.academy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "perfiles_tutores")
public class Tutor {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String areasEspecializacion;

    // Relación con el Usuario
    @OneToOne
    @JoinColumn(name = "usuario_id")
    @Getter @Setter
    private Usuario usuario;

}
