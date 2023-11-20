package com.tutorias.skill.forge.academy.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "comentarios")
@Entity
@ToString

public class Comentario {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
