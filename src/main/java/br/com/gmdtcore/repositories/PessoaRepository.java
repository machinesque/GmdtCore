
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.repositories;

import br.com.gmdtcore.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author luiz
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
