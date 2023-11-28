package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Sesion_Tutorias;

import java.util.List;

public interface Sesion_TutoriaDao {
    List<Sesion_Tutorias> getSesion();
    void registrar(Sesion_Tutorias sesionTutoria);
}
