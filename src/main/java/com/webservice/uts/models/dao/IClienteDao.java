/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.webservice.uts.models.dao;

import com.webservice.uts.models.entities.Cliente;
import com.webservice.uts.models.entities.Region;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author USUARIO
 */
public interface IClienteDao extends CrudRepository<Cliente, Long> {
    
    @Query("from Region")
	public List<Region> findAllRegiones();

    
}
