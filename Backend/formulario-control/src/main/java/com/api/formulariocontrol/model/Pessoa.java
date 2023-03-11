/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.formulariocontrol.model;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author João P. Arquim
 */
@Entity
@Table(name = "Pessoa")
@Data
public class Pessoa implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable=false)
    private String nome;
    @Column(nullable=false, unique=true)
    private String email;
    @Column(nullable=false, unique=true, length=15)
    private String telefone;
    @Column(nullable=false)
    private String data_nasc;
    @Column(nullable=false)
    private String sexo;
    @Column(nullable=false)
    private String cidade;
    @Column(nullable=false)
    private String estado;
    @Column(nullable=false)
    private String endereco;
    
    
}
