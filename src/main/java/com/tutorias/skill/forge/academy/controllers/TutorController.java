package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.TutorDao;
import com.tutorias.skill.forge.academy.models.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class TutorController {

    @Autowired
    private TutorDao tutorDao;


    @RequestMapping(value = "api/tutores", method = RequestMethod.POST)
    public Void registrarTutor(@RequestBody Tutor tutor) {
        // registro de tutores
        tutorDao.registrar(tutor);

    }

}