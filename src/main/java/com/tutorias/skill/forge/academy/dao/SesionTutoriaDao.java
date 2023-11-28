package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.SesionTutorias;

import java.util.List;

public interface SesionTutoriaDao {
    List<SesionTutorias> getSesion();
    void registrar(SesionTutorias sesionTutoria);
}
