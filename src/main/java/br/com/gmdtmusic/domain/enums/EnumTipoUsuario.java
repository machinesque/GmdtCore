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
public enum EnumTipoUsuario {
    
    ADMINISTRATOR(1, "Administrator"),
    GUEST(2, "Guest"); 
    
    private int codigo;
    private String descricao;

    private EnumTipoUsuario(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public EnumTipoUsuario toEnum(Integer codigo) {
        
        if (codigo != null) {
            
            for (EnumTipoUsuario tipoUsuario : EnumTipoUsuario.values()) {
                
                if (codigo.equals(tipoUsuario.getCodigo())) {
                    return tipoUsuario;
                }
                
            }
            
        }
        
        return null;
        
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
