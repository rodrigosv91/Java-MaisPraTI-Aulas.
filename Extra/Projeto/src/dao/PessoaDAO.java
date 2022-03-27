
package dao;

import dao.interfaceDAO.Operacoes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.Aluno;
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
    
    public void remover(int id) {
        PessoaRepository.remover(id);
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        PessoaRepository.atualizar(pessoa); 
    }

    @Override
    public ArrayList<Pessoa> buscarTodos() {
        return PessoaRepository.getLista(); 
    }
    
    public Pessoa buscarPessoa(int idPessoa){     
        if(PessoaRepository.getPessoaPorId(idPessoa) instanceof Aluno){
            //Se Aluno, substitui por Pessoa
            Pessoa pessoa = (Pessoa) PessoaRepository.getPessoaPorId(idPessoa);
            pessoa.setId(pessoa.getId());
            pessoa.setNome(pessoa.getNome());
            pessoa.setDataNascimento(pessoa.getDataNascimento());
            pessoa.setDataCadastro(pessoa.getDataCadastro());
            pessoa.setDataAlteracao(pessoa.getDataAlteracao());          
            return pessoa;           
        }else{ 
            return PessoaRepository.getPessoaPorId(idPessoa);
        }
        //return PessoaRepository.getPessoaPorId(idPessoa);
    }
    
}
