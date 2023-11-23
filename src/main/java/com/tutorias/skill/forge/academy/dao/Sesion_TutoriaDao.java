package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Sesion_Tutoria;

import java.util.List;

public interface Sesion_TutoriaDao {
    List<Sesion_Tutoria> getSesion();

    void registrar(Sesion_Tutoria sesionTutoria);
}
