package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Tutor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class TutorDaoImp implements TutorDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void registrar(Tutor tutor) {

    }

    @Override
    public List<Tutor> buscarTutores(String areasEspecializacion) {
        String query = "FROM perfiles_tutores";
        return entityManager.createQuery(query).getResultList();
    }
}
