package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, Long> { 
	Produto findById(long id);
        
        @Query("SELECT p FROM Produto p WHERE p.id = 1")
        Produto findProductOne(); 
}
