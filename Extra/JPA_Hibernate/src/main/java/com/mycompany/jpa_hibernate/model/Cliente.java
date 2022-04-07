
package com.mycompany.jpa_hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rodrigo
 */
@Entity 
@Table(name = "cliente")
public class Cliente {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //private int id;
    //por segurança usar Integer 
    //int nao aceita null e no banco de dados pode ser assinalado um campo de numeros como null
    
    @Column(name = "nome")
    private String nome;
    
    //<editor-fold defaultstate="collapsed" desc="comment">    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //</editor-fold>
}
