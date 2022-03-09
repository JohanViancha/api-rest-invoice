/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.webservice.uts.models.services;

import com.webservice.uts.models.entities.Cliente;
import com.webservice.uts.models.entities.Region;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface IClienteService {
    
    public List<Cliente> findAll();
    
    public Cliente findById(Long id);
    
    public Cliente save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public List<Region> findAllRegiones();
}
