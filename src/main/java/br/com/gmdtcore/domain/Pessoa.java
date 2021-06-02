/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.domain;

import br.com.gmdtcore.domain.enums.EnumTipoSexo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author luiz
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable{
 
    private static final long serialVersionUID = 1L;
    
    //Database PostgreSQL
    //@SequenceGenerator(name = "SEQUENCE_IDPESSOA", sequenceName = "idpessoa_sequence", initialValue = 1, allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUENCE_IDPESSOA")
    //Database H2 and MySql
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String sobrenome;
    
    private Integer sexo; //Mudar para EnumTipoSexo
    
    private OffsetDateTime dataNascimento;
    
    @JsonManagedReference
    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos = new ArrayList<>();
    
    @JsonManagedReference
    @OneToMany(mappedBy = "pessoa")
    private List<Email> emails = new ArrayList<>();

    public Pessoa() {
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public EnumTipoSexo getSexo() {
        return EnumTipoSexo.toEnum(sexo);
    }

    public void setSexo(EnumTipoSexo sexo) {
        this.sexo = sexo.getCodigo();
    }

    public OffsetDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(OffsetDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.id);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
