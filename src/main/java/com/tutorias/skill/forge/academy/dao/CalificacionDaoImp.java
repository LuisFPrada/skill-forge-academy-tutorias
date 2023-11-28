package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Calificacion;
import com.tutorias.skill.forge.academy.models.Perfiles_Tutores;
import com.tutorias.skill.forge.academy.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class CalificacionDaoImp implements CalificacionDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Usuario obtenerUsuarioPorId(Long estudianteId) {
        return null;
    }

    @Override
    public Perfiles_Tutores obtenerTutorPorId(Long tutorId) {
        return null;
    }

    @Override
    public Calificacion Guardar(Calificacion calificacion) {
        return entityManager.merge(calificacion);
    }
}
