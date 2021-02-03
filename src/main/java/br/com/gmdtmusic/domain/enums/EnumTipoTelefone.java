/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtmusic.domain.enums;

/**
 *
 * @author luiz
 */
public enum EnumTipoTelefone {
    
    RESIDENCIAL(1, "Residencial"), 
    CELULAR(2, "Celular"), 
    COMERCIAL(3, "Comercial");
    
    private int codigo;
    private String descricao;

    private EnumTipoTelefone(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public EnumTipoTelefone toEnum(Integer codigo) {
      
        if (codigo != null) {
            for (EnumTipoTelefone tipoTelefone : EnumTipoTelefone.values()) {

                if (codigo.equals(tipoTelefone.getCodigo())) {
                    return tipoTelefone;
                }

            }

            throw new IllegalArgumentException("Id inválido: " + codigo);
        }
        
        return null;
        
    }
    
}
