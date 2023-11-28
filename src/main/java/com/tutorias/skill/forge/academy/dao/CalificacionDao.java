package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Calificacion;
import com.tutorias.skill.forge.academy.models.Perfiles_Tutores;
import com.tutorias.skill.forge.academy.models.Usuario;

public interface CalificacionDao {
    Usuario obtenerUsuarioPorId(Long estudianteId);

    Perfiles_Tutores obtenerTutorPorId(Long tutorId);

    Calificacion Guardar(Calificacion calificacion);
}
