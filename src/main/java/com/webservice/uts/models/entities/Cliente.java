/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webservice.uts.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 *
 * @author USUARIO
 */

@Data
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    
    @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
   @NotEmpty(message="el campo nombre no puede ser vacío")
   @Size(min=3,max=30,message="el tamaño debe estar entre 3 y 30")
   @Column(nullable=false)
    private String nombre;
    private String apellido;
    
    @Email(message="el campo de email no es una dirección de correo bien formada")
    @Column(nullable=false, unique=true)
    private String email;
    
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    
    @NotNull(message="la región no puede ser vacia")
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="region_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
       private Region region;
    
    
    private static final long serialVersionUID = 1L;
    
    
    
}
