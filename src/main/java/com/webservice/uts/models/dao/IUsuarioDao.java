/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.webservice.uts.models.dao;

import com.webservice.uts.models.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface IUsuarioDao extends CrudRepository<Usuario,Long>  {
    	
        public Usuario findByUsername(String username);

        @Query("select u from Usuario u where u.username=?1")	
        public Usuario findByUsername2(String username);
    }
