
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
        pDao.remover(pessoa);   
    }
    
    public void removerPessoa(int id) {      
        PessoaDAO pDao =  new PessoaDAO();
        pDao.remover(id);   
    }
}
