/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Usuario;
import java.util.List;

/**
 *
 * @author PC
 */
public interface UsuarioService {
    public List<Usuario> getUsuario();
    
    public Usuario getUsuario (Usuario usuario);
    
    public Usuario getUsuarioPorUsername (String username);
    
    public Usuario getUsuarioPorUsernameYPassword (String username, String password);
    
    public Usuario getUsuarioPorUsernameOCorreo (String username, String correo);
    
    public boolean existsUsuarioPorUsernameOCorreo (String username, String correo);
    
    public void save (Usuario usuario, boolean crearRolUser);
    
    public void delete (Usuario usuario);
}
