package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.PerfilTutor;
import com.tutorias.skill.forge.academy.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean obtenerUsuarioPorCredenciales(Usuario usuario);

    Usuario obtenerUsuarioPorId(Long estudianteId);

    PerfilTutor obtenerTutorPorId(Long tutorId);
}
