package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Calificacion;
import com.tutorias.skill.forge.academy.models.PerfilesTutores;
import com.tutorias.skill.forge.academy.models.Usuario;

public interface CalificacionDao {
    Usuario obtenerUsuarioPorId(Long estudianteId);

    PerfilesTutores obtenerTutorPorId(Long tutorId);

    Calificacion Guardar(Calificacion calificacion);
}
