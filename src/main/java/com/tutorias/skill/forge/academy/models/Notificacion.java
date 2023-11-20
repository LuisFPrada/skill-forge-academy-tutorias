package com.tutorias.skill.forge.academy.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@Table(name = "comentarios")
@Entity
@ToString

public class Notificacion {
    @Id
    @Getter @Setter @Column (name = "id_notificacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @Getter @Setter
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Getter @Setter @Column (name = "mensaje")
    private String mensaje;

    @Getter @Setter
    @Column(name = "fecha")
    private LocalDateTime fecha;


}