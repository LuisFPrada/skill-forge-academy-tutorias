package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.Sesion_TutoriaDao;
import com.tutorias.skill.forge.academy.models.Sesion_Tutoria;
import com.tutorias.skill.forge.academy.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class Sesion_TutoriaController {

    @Autowired
    Sesion_TutoriaDao sesionTutoriaDao;

    @RequestMapping(value = "api/sesion_tutorias", method = RequestMethod.GET)
    public List<Sesion_Tutoria> getSesion(@PathVariable Long id) {
               return sesionTutoriaDao.getSesion();
    }
}
