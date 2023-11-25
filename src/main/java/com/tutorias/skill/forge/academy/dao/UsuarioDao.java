package com.tutorias.skill.forge.academy.dao;

import com.tutorias.skill.forge.academy.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean obtenerUsuarioPorCredenciales(Usuario usuario);

}
