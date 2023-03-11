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
public class FormularioService implements IFormService{
    
    @Autowired
    FormularioRepository formRepository;
    
    @Transactional
    @Override
    public Pessoa save(Pessoa pessoa){
        return formRepository.save(pessoa);
    }
    
    @Override
    public List<Pessoa> findAll(){
        return formRepository.findAll();
    }
    
    @Override
    public Optional<Pessoa> findById(Long id){
        return formRepository.findById(id);
    }

    @Override
    public void delete(Pessoa pessoa) {
        formRepository.delete(pessoa);
    }
    
}
