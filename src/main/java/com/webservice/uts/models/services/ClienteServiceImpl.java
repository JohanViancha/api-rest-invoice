/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice.uts.models.services;

import com.webservice.uts.models.dao.IClienteDao;
import com.webservice.uts.models.entities.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USUARIO
 */
@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll() {

         return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Cliente findById(Long id) {

         return clienteDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
           
          clienteDao.delete(cliente);
    }
    
}
