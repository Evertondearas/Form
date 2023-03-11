/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.formulariocontrol.service;

import com.api.formulariocontrol.model.Pessoa;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author João P. Arquim
 */
interface IFormService {
    
    
    public Pessoa save(Pessoa pessoa);
    public List<Pessoa> findAll();
    public Optional<Pessoa> findById(Long id);
    public void delete(Pessoa pessoa);
}
