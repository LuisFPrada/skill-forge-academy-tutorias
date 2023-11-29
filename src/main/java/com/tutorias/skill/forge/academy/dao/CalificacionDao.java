package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Calificacion;
import com.tutorias.skill.forge.academy.models.PerfilTutor;
import com.tutorias.skill.forge.academy.models.Usuario;

public interface CalificacionDao {
    Usuario obtenerUsuarioPorId(Long estudianteId);

    PerfilTutor obtenerTutorPorId(Long tutorId);

    Calificacion Guardar(Calificacion calificacion);
}
