package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.TutorDao;
import com.tutorias.skill.forge.academy.models.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TutorController {

    @Autowired
    private TutorDao tutorDao;

//Registrar Tutores
    @RequestMapping(value = "api/tutores", method = RequestMethod.POST)
    public void registrarTutor(@RequestBody Tutor tutor) {
        // registro de tutores
        tutorDao.registrar(tutor);

    }
//Buscar tutores por especialización
    @GetMapping(value = "api/tutores")
    public List<Tutor> buscarTutores(@RequestParam String areas_especializacion) {
        return tutorDao.buscarTutores(areas_especializacion);
    }

}