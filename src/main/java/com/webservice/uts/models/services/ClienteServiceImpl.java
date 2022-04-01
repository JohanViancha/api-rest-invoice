/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice.uts.models.services;

import com.webservice.uts.models.dao.IClienteDao;
import com.webservice.uts.models.dao.IFacturaDao;
import com.webservice.uts.models.dao.IProductoDao;
import com.webservice.uts.models.entities.Cliente;
import com.webservice.uts.models.entities.Factura;
import com.webservice.uts.models.entities.Producto;
import com.webservice.uts.models.entities.Region;
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
    
    @Autowired
    private IFacturaDao facturaDao;

    @Autowired
    private IProductoDao productoDao;
    
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

    @Override
    @Transactional(readOnly = true)
    public List<Region> findAllRegiones() {
         return clienteDao.findAllRegiones();
    }

    @Override
    public Factura findFacturaById(Long id) {
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    public List<Factura> findFacturaAll() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    public Factura saveFactura(Factura factura) {
          return facturaDao.save(factura);
    }

    @Override
    public void deleteFacturaById(Long id) {
        facturaDao.deleteById(id);
    }

    @Override
    public List<Producto> findProductoByNombre(String term) {
       return productoDao.findByNombreContainingIgnoreCase(term);
    }
    
}
