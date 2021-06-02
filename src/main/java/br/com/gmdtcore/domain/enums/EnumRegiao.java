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
public enum EnumRegiao {
 
    NORTE(1, "Norte"),
    SUL(2, "Sul"),
    LESTE(3, "Leste"),
    OESTE(4, "Oeste"),
    NORDESTE(5, "Nordeste"),
    NOROESTE(6, "Noroeste"),
    SUDESTE(7, "Sudeste"),
    SUDOESTE(8, "Sudoeste"),
    CENTRO_OESTE(9, "Centro-Oeste"),
    CENTRO(10, "Centro");

    private int codigo;
    private String descricao;

    private EnumRegiao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EnumRegiao toEnum(Integer codigo) {

        if (codigo != null) {
            for (EnumRegiao regiao : EnumRegiao.values()) {

                if (codigo.equals(regiao.getCodigo())) {
                    return regiao;
                }

            }

            throw new IllegalArgumentException("Id inválido: " + codigo);
        }

        return null;

    }
    
}
