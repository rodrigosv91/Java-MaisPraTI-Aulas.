
package dao.interfaceDAO;

import java.util.List;
import model.Pessoa;

/**
 *
 * @author Rodrigo Vieira
 */
public interface Operacoes {
    
    /**
     * 
     * @param pessoa a pessoa sendo inserida
     */
    void adicionar(Pessoa pessoa);  
    
    /**
     * 
     * @param pessoa a pessoa sendo removida
     */  
    void remover(Pessoa pessoa);
      
    /**
     * 
     * @param pessoa a pessoa sendo atualizada
     */
    void atualizar(Pessoa pessoa);
    
    /**
     * 
     * @param id o id da pessoa sendo buscada
     * @return Pessoa a pessoa com o id correspondente
     */
    //Pessoa buscar(int id);
    
    /**
     * 
     * @return List<Pessoa> lista com todas as pessoas 
     */
    List<Pessoa> buscarTodos();
}