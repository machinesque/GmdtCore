/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtmusic.services;

import br.com.gmdtmusic.domain.Pessoa;
import br.com.gmdtmusic.repositories.PessoaRepository;
import br.com.gmdtmusic.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luiz
 */
@Service
public class PessoaService {
    
    @Autowired
    private PessoaRepository pessoaRepository;
    
    public Pessoa findById(Long id) {
        return pessoaRepository.findById(id)
		.orElseThrow(() -> new ObjectNotFoundException("Pessoa não encontrada!"));
        
//        Optional<Pessoa> objetoPessoa = pessoaRepository.findById(id);
//        return objetoPessoa.orElse(null);
    }
    
}
