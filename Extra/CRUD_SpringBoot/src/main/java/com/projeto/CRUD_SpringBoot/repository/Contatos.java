
package com.projeto.CRUD_SpringBoot.repository;

import com.projeto.CRUD_SpringBoot.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Rodrigo
 */
public interface Contatos extends JpaRepository<Contato, Long>{
    
}
