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
public enum EnumTipoEndereco {
    
    RESIDENCIAL(1, "Residencial"),
    COMERCIAL(2, "Comercial"); 
    
    private int codigo;
    private String descricao;

    private EnumTipoEndereco(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public static EnumTipoEndereco toEnum(Integer codigo) {

        if (codigo != null) {
            for (EnumTipoEndereco tipoEndereco : EnumTipoEndereco.values()) {

                if (codigo.equals(tipoEndereco.getCodigo())) {
                    return tipoEndereco;
                }

            }

            throw new IllegalArgumentException("Id inválido: " + codigo);
        }

        return null;

    }
    
}
