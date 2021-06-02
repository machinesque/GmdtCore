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
public class PessoaJuridica extends Pessoa {
    
    private static final long serialVersionUID = 1L;
    
    private String cnpj;
    
    private String inscricaoEstadual;

    public PessoaJuridica() {
        
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
}
