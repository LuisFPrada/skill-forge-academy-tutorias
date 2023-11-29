package com.tutorias.skill.forge.academy.dao.daoImp;

import com.tutorias.skill.forge.academy.dao.SesionTutoriaDao;
import com.tutorias.skill.forge.academy.models.SesionTutoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class SesionTutoriaDaoImp implements SesionTutoriaDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<SesionTutoria> getSesion() {
        String query = "FROM sesiones_tutoria";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void registrar(SesionTutoria sesionTutoria) {
        entityManager.merge(sesionTutoria);

    }
}

