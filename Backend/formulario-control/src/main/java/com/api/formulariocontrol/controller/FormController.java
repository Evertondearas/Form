/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.formulariocontrol.controller;

import com.api.formulariocontrol.dto.FormDto;
import com.api.formulariocontrol.model.Pessoa;
import com.api.formulariocontrol.service.FormularioService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author João P. Arquim
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/formulario")
public class FormController {
    
    final FormularioService formService;

    public FormController(FormularioService formService) {
        this.formService = formService;
    }
    
    @PostMapping
    public ResponseEntity<Object> saveFormulario(@RequestBody @Valid FormDto formDto){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(formDto, pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(formService.save(pessoa));
    }
    
    @GetMapping
    public ResponseEntity<List<Pessoa>> getAllFormulario(){
        return ResponseEntity.status(HttpStatus.CREATED).body(formService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneFormulario(@PathVariable(value = "id") UUID id){
        Optional<Pessoa> pessoa = formService.findById(id);
        if (!pessoa.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(pessoa.get());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteFormulario(@PathVariable(value = "id") UUID id){
        Optional<Pessoa> pessoaOptional = formService.findById(id);
        if (!pessoaOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa not found.");
        }
        formService.delete(pessoaOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Pessoa deleted successfully.");
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateFormulario(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid FormDto formDto){
        Optional<Pessoa> pessoaOptional = formService.findById(id);
        if (!pessoaOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pessoa not found.");
        }
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(formDto, pessoa);
        pessoa.setId(pessoaOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(formService.save(pessoa));
    }
    
}
