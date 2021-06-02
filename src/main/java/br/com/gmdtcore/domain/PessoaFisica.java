/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.domain;

import javax.persistence.Entity;

/**
 *
 * @author luiz
 */
@Entity
public class PessoaFisica extends Pessoa {
    
    private static final long serialVersionUID = 1L;
    
    private String cpf;
    
    private String rg;

    public PessoaFisica() {
        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
