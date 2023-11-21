package com.tutorias.skill.forge.academy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "comentarios")
@Entity
public class Comentario {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
