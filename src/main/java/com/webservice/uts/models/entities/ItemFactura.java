/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice.uts.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author USUARIO
 */

@Entity
@Table(name="facturas_items")
        
public class ItemFactura implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    private Integer cantidad;
    
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="producto_id")
    private Producto producto;
    
    public Long getId() {
            return id;
    }

    public void setId(Long id) {
            this.id = id;
    }

    public Integer getCantidad() {
            return cantidad;
    }

    public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
    }

    public Double getImporte() {
            return cantidad.doubleValue() * producto.getPrecio();
    }

    public Producto getProducto() {
            return producto;
    }

    public void setProducto(Producto producto) {
            this.producto = producto;
    }




    private static final long serialVersionUID = 1L;

    
}
