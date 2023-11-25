package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Perfiles_Tutores;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class TutorDaoImp implements TutorDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void registrar(Perfiles_Tutores perfilesTutores) {

    }

    @Override
    public List<Perfiles_Tutores> buscarTutores(String areasEspecializacion) {
        String query = "FROM perfiles_tutores";
        return entityManager.createQuery(query).getResultList();
    }
}
