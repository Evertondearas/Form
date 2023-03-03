/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.formulariocontrol.repository;

import com.api.formulariocontrol.model.Pessoa;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author João P. Arquim
 */
@Repository
public interface FormularioRepository extends JpaRepository<Pessoa, UUID>{
    
}
