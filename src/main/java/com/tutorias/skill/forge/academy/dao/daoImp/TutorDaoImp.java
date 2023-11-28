package com.tutorias.skill.forge.academy.dao.daoImp;

import com.tutorias.skill.forge.academy.dao.TutorDao;
import com.tutorias.skill.forge.academy.models.PerfilesTutores;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TutorDaoImp implements TutorDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void registrar(PerfilesTutores perfilesTutores) {

    }

    @Override
    public List<PerfilesTutores> buscarTutores(String areasEspecializacion) {
        String query = "FROM perfiles_tutores";
        return entityManager.createQuery(query).getResultList();
    }
}
