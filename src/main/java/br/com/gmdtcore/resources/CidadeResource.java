/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.resources;

import br.com.gmdtcore.domain.Cidade;
import br.com.gmdtcore.repositories.CidadeRepository;
import br.com.gmdtcore.services.CidadeService;
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
@RequestMapping(value = "/cidades")
public class CidadeResource {
  
    @Autowired
    public CidadeRepository cidadeRepository;

    @Autowired
    public CidadeService cidadeService;
    
    @GetMapping
    public List<Cidade> listCidade() {
        return cidadeRepository.findAll();
    }
    
    //    @GetMapping(value = "/{id}")
    //    public ResponseEntity<?> findById(@PathVariable Long id) {
    //        
    //        Cidade cidade = bairroService.findById(id);
    //        return ResponseEntity.ok().body(cidade);
    //        
    //    }
    
}
