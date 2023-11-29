package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.SesionTutoria;

import java.util.List;

public interface SesionTutoriaDao {
    List<SesionTutoria> getSesion();
    void registrar(SesionTutoria sesionTutoria);
}
