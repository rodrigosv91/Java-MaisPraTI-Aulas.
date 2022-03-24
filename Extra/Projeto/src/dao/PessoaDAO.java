
package dao;

import dao.interfaceDAO.Operacoes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Pessoa;
import repository.PessoaRepository;

/**
 *
 * @author Rodrigo Vieira
 */
public class PessoaDAO implements Operacoes{

    @Override
    public void adicionar(Pessoa pessoa) {
        PessoaRepository.inserir(pessoa);
    }

    @Override 
    public void remover(Pessoa pessoa) {
        PessoaRepository.remover(pessoa.getId());
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        PessoaRepository.atualizar(pessoa); 
    }

    @Override
    public ArrayList<Pessoa> buscarTodos() {
        return PessoaRepository.getLista(); 
    }
    
}
