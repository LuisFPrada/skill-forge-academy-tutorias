package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.TutorDao;
import com.tutorias.skill.forge.academy.models.Perfiles_Tutores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TutorController {

    @Autowired
    private TutorDao tutorDao;

//Registrar Tutores
    @RequestMapping(value = "api/tutores", method = RequestMethod.POST)
    public void registrarTutor(@RequestBody Perfiles_Tutores perfilesTutores) {
        // registro de tutores
        tutorDao.registrar(perfilesTutores);

    }
//Buscar tutores por especialización
    @GetMapping(value = "api/tutores")
    public List<Perfiles_Tutores> buscarTutores(@RequestParam String areas_especializacion) {
        return tutorDao.buscarTutores(areas_especializacion);
    }

}