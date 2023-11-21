package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Sesion_Tutoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class Sesion_TutoriaDaoImp implements Sesion_TutoriaDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Sesion_Tutoria> getSesion() {
        String query = "FROM Sesion_Tutoria";
        return entityManager.createQuery(query).getResultList();
    }
}

