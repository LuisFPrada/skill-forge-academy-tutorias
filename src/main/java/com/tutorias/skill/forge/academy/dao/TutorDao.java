package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Perfiles_Tutores;

import java.util.List;

public interface TutorDao {
    void registrar(Perfiles_Tutores perfilesTutores);

    List<Perfiles_Tutores> buscarTutores(String areasEspecializacion);
}
