/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.webservice.uts.models.services;

import com.webservice.uts.models.entities.Usuario;

/**
 *
 * @author USUARIO
 */
public interface IUsuarioService {
    
    
	public Usuario findByUsername(String username);
	
	public void delete(Usuario Usuario);

}
