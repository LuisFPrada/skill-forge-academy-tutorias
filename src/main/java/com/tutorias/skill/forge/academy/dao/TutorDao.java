package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.PerfilTutor;

import java.util.List;

public interface TutorDao {
    void registrar(PerfilTutor perfilTutor);

    List<PerfilTutor> buscarTutores(String areasEspecializacion);
}
