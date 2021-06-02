/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.services;

import br.com.gmdtcore.domain.Endereco;
import br.com.gmdtcore.repositories.EnderecoRepository;
import br.com.gmdtcore.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author luiz
 */
@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    public Endereco findById(Long id) {
        return enderecoRepository.findById(id)
		.orElseThrow(() -> new ObjectNotFoundException("Endereço não encontrada!"));
    }
    
}
