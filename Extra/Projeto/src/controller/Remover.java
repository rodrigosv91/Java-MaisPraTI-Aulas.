
package controller;

import dao.PessoaDAO;
import model.Pessoa;

/**
 *
 * @author Rodrigo Vieira
 */
public class Remover {
    
    public void removerPessoa(Pessoa pessoa) {      
        PessoaDAO pDao =  new PessoaDAO();
        if(pDao.buscarTodos().contains(pDao.buscarPessoa(pessoa.getId()))){
            pDao.remover(pessoa); 
            if(!pDao.buscarTodos().contains(pDao.buscarPessoa(pessoa.getId()))){
                System.out.println("Removido");
            }
        }
        else{
            System.out.println("Não há pessoa ou aluno com identificação: " + pessoa.getId());
        }
    }
    
    public void removerPessoa(int id) {          
        PessoaDAO pDao =  new PessoaDAO();       
        if(pDao.buscarTodos().contains(pDao.buscarPessoa(id))){
            pDao.remover(id); 
            if(!pDao.buscarTodos().contains(pDao.buscarPessoa(id))){
                System.out.println("Removido");
            }
        }
        else{
            System.out.println("Não há pessoa ou aluno com identificação: " + id);
        }
    }
}
