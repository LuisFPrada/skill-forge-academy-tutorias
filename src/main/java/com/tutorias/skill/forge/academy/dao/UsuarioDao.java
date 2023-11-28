package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.PerfilesTutores;
import com.tutorias.skill.forge.academy.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean obtenerUsuarioPorCredenciales(Usuario usuario);

    Usuario obtenerUsuarioPorId(Long estudianteId);

    PerfilesTutores obtenerTutorPorId(Long tutorId);
}
