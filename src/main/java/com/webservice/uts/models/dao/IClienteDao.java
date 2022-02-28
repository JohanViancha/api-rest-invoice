/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.webservice.uts.models.dao;

import com.webservice.uts.models.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface IClienteDao extends CrudRepository<Cliente, Long> {
    
    
    
}
