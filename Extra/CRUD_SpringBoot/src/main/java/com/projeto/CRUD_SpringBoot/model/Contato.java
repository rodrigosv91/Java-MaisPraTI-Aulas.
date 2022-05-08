
package com.projeto.CRUD_SpringBoot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotEmpty; 
import javax.validation.constraints.Email;
/**
 *
 * @author Rodrigo
 */
@Entity
public class Contato implements Serializable{
    
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @NotEmpty 
    @Email
    private String email;

    public Contato() {
    }  
    
    //@Autowired
    public Contato( String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // <editor-fold defaultstate="collapsed" desc="getters e setters">
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // </editor-fold>
    
}
