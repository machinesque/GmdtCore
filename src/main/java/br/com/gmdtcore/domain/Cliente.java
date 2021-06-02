/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.domain;

import java.util.Date;

/**
 *
 * @author luiz
 */
public class Cliente extends PessoaFisica {
    
    private static final long serialVersionUID = 1L;
    
    private Date dataCadastro;
    
    private boolean ativo;
    
    private Long matricula;

    public Cliente() {
        
    }
    
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
    
}
