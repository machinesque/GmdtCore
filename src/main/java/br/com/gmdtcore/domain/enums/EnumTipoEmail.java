/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.domain.enums;

/**
 *
 * @author luiz
 */
public enum EnumTipoEmail {
    
    PRINCIPAL(1, "Principal"), 
    PESSOAL(2, "Pessoal"), 
    COMERCIAL(3, "Comercial");
    
    private int codigo;
    private String descricao;

    private EnumTipoEmail(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public static EnumTipoEmail toEnum(Integer codigo) {
      
        if (codigo != null) {
            for (EnumTipoEmail tipoTelefone : EnumTipoEmail.values()) {

                if (codigo.equals(tipoTelefone.getCodigo())) {
                    return tipoTelefone;
                }

            }

            throw new IllegalArgumentException("Id inválido: " + codigo);
        }
        
        return null;
        
    }
    
}
