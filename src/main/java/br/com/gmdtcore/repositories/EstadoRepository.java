/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.repositories;

import br.com.gmdtcore.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author luiz
 */
public interface EstadoRepository extends JpaRepository<Estado, Long> {
    
}
