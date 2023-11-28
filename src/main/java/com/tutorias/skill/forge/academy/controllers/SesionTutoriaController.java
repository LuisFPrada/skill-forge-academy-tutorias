package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.SesionTutoriaDao;
import com.tutorias.skill.forge.academy.models.SesionTutorias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SesionTutoriaController {

    @Autowired
    SesionTutoriaDao sesionTutoriaDao;

    @RequestMapping(value = "api/tutorias", method = RequestMethod.GET)
    public List<SesionTutorias> getSesion() {
        return sesionTutoriaDao.getSesion();
    }


    @RequestMapping(value = "api/tutorias", method = RequestMethod.POST)
    public void registrarSesionTutoria(@RequestBody SesionTutorias sesionTutoria) {

        sesionTutoriaDao.registrar(sesionTutoria);
    }


}

