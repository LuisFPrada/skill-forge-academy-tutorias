package com.tutorias.skill.forge.academy.controllers;

import com.tutorias.skill.forge.academy.dao.CalificacionDao;
import com.tutorias.skill.forge.academy.dao.TutorDao;
import com.tutorias.skill.forge.academy.dao.UsuarioDao;
import com.tutorias.skill.forge.academy.models.Calificacion;
import com.tutorias.skill.forge.academy.models.PerfilesTutores;
import com.tutorias.skill.forge.academy.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalificacionController {

        @Autowired
        private CalificacionDao calificacionDao;

        @Autowired
        private UsuarioDao usuarioDao;

        @Autowired
        private TutorDao tutorDao;

        public Calificacion dejarCalificacion(Long estudianteId, Long tutorId, Calificacion calificacion) {
            // Lógica para dejar calificaciones
            Usuario estudiante = usuarioDao.obtenerUsuarioPorId(estudianteId);
            PerfilesTutores tutor = usuarioDao.obtenerTutorPorId(tutorId);

            calificacion.setEstudiante(estudiante);
            calificacion.setPerfilesTutores(tutor);

            return calificacionDao.Guardar(calificacion);
        }
 }


