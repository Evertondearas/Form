/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.formulariocontrol.controller;

import com.api.formulariocontrol.dto.FormDto;
import com.api.formulariocontrol.model.Pessoa;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author João P. Arquim
 */
interface IFormControl {
    
    public ResponseEntity<Object> saveFormulario(@RequestBody @Valid FormDto formDto);
    public ResponseEntity<List<Pessoa>> getAllFormulario();
    public ResponseEntity<Object> getOneFormulario(@PathVariable(value = "id") Long id);
    public ResponseEntity<Object> deleteFormulario(@PathVariable(value = "id") Long id);
    public ResponseEntity<Object> updateFormulario(@PathVariable(value = "id") Long id,
                                                    @RequestBody @Valid FormDto formDto);
    
}
