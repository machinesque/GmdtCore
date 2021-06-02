/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.domain.enums;

/**
 *
 * @author luizam
 */
public enum EnumTipoSexo {
    FEMININO(1, "Feminino"), 
    MASCULINO(2, "Masculino");
    
    private int codigo;
    private String desc;

    private EnumTipoSexo(int codigo, String desc) {
        this.codigo = codigo;
        this.desc = desc;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDesc() {
        return desc;
    }

    public static EnumTipoSexo toEnum(Integer codigo) {

        if (codigo != null) {
            for (EnumTipoSexo tipoSexo : EnumTipoSexo.values()) {

                if (codigo.equals(tipoSexo.getCodigo())) {
                    return tipoSexo;
                }

            }

            throw new IllegalArgumentException("Id inválido: " + codigo);
        }

        return null;

    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
