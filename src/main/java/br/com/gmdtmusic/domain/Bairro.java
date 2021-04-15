/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtmusic.domain;

import br.com.gmdtmusic.domain.enums.EnumRegiao;
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
public class Bairro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    //Database PostgreSQL
    //@SequenceGenerator(name = "SEQUENCE_IDBAIRRO", sequenceName = "idbairro_sequence", initialValue = 1, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_IDBAIRRO")
    //Database H2 and MySql
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    
    private String nome;
    
    private Integer regiao; 
    
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="cidade_id")
    private Cidade cidade;
    
    @JsonBackReference
    @OneToMany(mappedBy = "bairro")
    private List<Endereco> enderecos = new ArrayList<>();

    public Bairro() {
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Bairro other = (Bairro) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bairro{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}
