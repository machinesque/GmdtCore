/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtmusic.resources;

import br.com.gmdtmusic.domain.Pessoa;
import br.com.gmdtmusic.services.PessoaService;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author luiz
 */
@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
    
    @Autowired
    private PessoaService pessoaService;
    
    @GetMapping
    public List<Pessoa> listPessoas() {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.setId(1L);
        p1.setDataNascimento(OffsetDateTime.of(1987, 5, 26, 0, 0, 0, 0, ZoneOffset.UTC));
        p1.setNome("Luiz Antonio");
        p1.setSobrenome("Machinesque");
        p1.setSexo("Masculino");
        
        p2.setId(2L);
        p2.setDataNascimento(OffsetDateTime.of(1981, 9, 5, 0, 0, 0, 0, ZoneOffset.UTC));
        p2.setNome("Simone Pirrotti Ferreira");
        p2.setSobrenome("Machinesque");
        p2.setSexo("Feminino");
        
        List<Pessoa> listaPessoas = new ArrayList<>();
        
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        
        return listaPessoas;
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        
        Pessoa pessoa = pessoaService.findById(id);
        return ResponseEntity.ok().body(pessoa);
        
    }
    
}
