package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.PerfilesTutores;

import java.util.List;

public interface TutorDao {
    void registrar(PerfilesTutores perfilesTutores);

    List<PerfilesTutores> buscarTutores(String areasEspecializacion);
}
