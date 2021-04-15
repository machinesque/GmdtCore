/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtmusic.repositories;

import br.com.gmdtmusic.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author luiz
 */
public interface EmailRepository extends JpaRepository<Email, Long> {
    
}
