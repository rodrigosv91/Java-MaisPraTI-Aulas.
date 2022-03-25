
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
 * @author Rodrigo
 */
public class AlunoDAO implements Operacoes{

    @Override
    public void adicionar(Pessoa pessoa) {
        Aluno aluno = (Aluno) pessoa;
        PessoaRepository.inserir(aluno);
    }

    @Override
    public void remover(Pessoa pessoa) {
        PessoaRepository.remover(pessoa.getId()); 
    }

    @Override
    public void atualizar(Pessoa pessoa) {
        Aluno aluno = (Aluno) pessoa;
        PessoaRepository.atualizar(aluno);
    }

    @Override
    public ArrayList<Pessoa> buscarTodos() {
        return PessoaRepository.getLista(); 
    }
    
    public Aluno buscarPessoa(int idAluno){
        return (Aluno) PessoaRepository.getPessoaPorId(idAluno);      
    }
}
