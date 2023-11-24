package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Tutor;

import java.util.List;

public interface TutorDao {
    void registrar(Tutor tutor);

    List<Tutor> buscarTutores(String areasEspecializacion);
}
