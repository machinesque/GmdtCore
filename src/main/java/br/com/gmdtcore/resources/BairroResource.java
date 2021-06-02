/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.resources;

import br.com.gmdtcore.domain.Bairro;
import br.com.gmdtcore.repositories.BairroRepository;
import br.com.gmdtcore.services.BairroService;
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
@RequestMapping(value = "/bairros")
public class BairroResource {
    
    @Autowired
    public BairroRepository bairroRepository;

    @Autowired
    public BairroService bairroService;
    
    @GetMapping
    public List<Bairro> listBairro() {
        return bairroRepository.findAll();
    }
    
    //    @GetMapping(value = "/{id}")
    //    public ResponseEntity<?> findById(@PathVariable Long id) {
    //        
    //        Bairro bairro = bairroService.findById(id);
    //        return ResponseEntity.ok().body(bairro);
    //        
    //    }
    
}
