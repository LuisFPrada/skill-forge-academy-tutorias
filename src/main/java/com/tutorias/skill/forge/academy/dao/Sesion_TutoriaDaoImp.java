package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Sesion_Tutorias;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class Sesion_TutoriaDaoImp implements Sesion_TutoriaDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Sesion_Tutorias> getSesion() {
        String query = "FROM sesiones_tutoria";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void registrar(Sesion_Tutorias sesionTutoria) {
        entityManager.merge(sesionTutoria);

    }
}

