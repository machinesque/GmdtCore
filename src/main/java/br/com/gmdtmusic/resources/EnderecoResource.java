/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtmusic.resources;

import br.com.gmdtmusic.domain.Endereco;
import br.com.gmdtmusic.repositories.EnderecoRepository;
import br.com.gmdtmusic.services.EnderecoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luiz
 */
@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Autowired
    private EnderecoService enderecoService;
    
    @GetMapping
    public List<Endereco> listEndereco() {
        return enderecoRepository.findAll();
    }
    
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<?> findById(@PathVariable Long id) {
//        
//        Endereco endereco = enderecoService.findById(id);
//        return ResponseEntity.ok().body(endereco);
//        
//    }
    
}
