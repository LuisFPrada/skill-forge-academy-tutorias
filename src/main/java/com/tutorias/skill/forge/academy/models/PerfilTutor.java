package com.tutorias.skill.forge.academy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "perfiles_tutores")
public class PerfilTutor {


    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;


    @Getter @Setter
    private String experienciaEducativa;


    @Getter @Setter
    private String areasEspecializacion;

    @Getter @Setter
    private double tarifaPorHora;
}
