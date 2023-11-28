package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.TutorDao;
import com.tutorias.skill.forge.academy.dao.UsuarioDao;
import com.tutorias.skill.forge.academy.models.PerfilesTutores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TutorController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private TutorDao tutorDao;

    //Registrar Tutores
    @RequestMapping(value = "api/tutores", method = RequestMethod.POST)
    public void registrarTutor(@RequestBody PerfilesTutores perfilesTutores) {
        // registro de tutores
        tutorDao.registrar(perfilesTutores);

    }

    //Buscar tutores por especialización
    @GetMapping(value = "api/tutores/{areas_especializacion}")
    public List<PerfilesTutores> buscarTutores(@RequestParam String areas_especializacion) {
        return tutorDao.buscarTutores(areas_especializacion);
    }

}
