/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.formulariocontrol.service;

import com.api.formulariocontrol.model.Pessoa;
import com.api.formulariocontrol.repository.FormularioRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author João P. Arquim
 */
@Service
public class FormularioService {
    
    @Autowired
    FormularioRepository formRepository;
    
    @Transactional
    public Pessoa save(Pessoa pessoa){
        return formRepository.save(pessoa);
    }
    
    public List<Pessoa> findAll(){
        return formRepository.findAll();
    }
    
    public Optional<Pessoa> findById(UUID id){
        return formRepository.findById(id);
    }
    
}
