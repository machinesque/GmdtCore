/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.domain;

import br.com.gmdtcore.domain.enums.EnumRegiao;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author luiz
 */
@Entity
public class Cidade implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    //Database PostgreSQL
    //@SequenceGenerator(name = "SEQUENCE_IDCIDADE", sequenceName = "idcidade_sequence", initialValue = 1, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_IDCIDADE")
    //Database H2 and MySql
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    private String nome;
    
    private Integer regiao; //enum
    
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;
    
    @JsonBackReference
    @OneToMany(mappedBy = "cidade")
    private List<Bairro> bairros = new ArrayList<>();

    public Cidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumRegiao getRegiao() {
        return EnumRegiao.toEnum(regiao);
    }

    public void setRegiao(EnumRegiao regiao) {
        this.regiao = regiao.getCodigo();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}
