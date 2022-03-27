
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
    
    public Aluno buscarAluno(int idAluno){
        if(PessoaRepository.getPessoaPorId(idAluno) instanceof Aluno){
            //Se Aluno, retorna com casting  
            return (Aluno) PessoaRepository.getPessoaPorId(idAluno); 
        }else{          
            //Se não, busca Aluno com dados disponiveis de pessoa
            Pessoa pessoa = PessoaRepository.getPessoaPorId(idAluno);
            Aluno aluno = new Aluno();
            aluno.setId(pessoa.getId());
            aluno.setNome(pessoa.getNome());
            aluno.setDataNascimento(pessoa.getDataNascimento());
            aluno.setDataCadastro(pessoa.getDataCadastro());
            aluno.setDataAlteracao(pessoa.getDataAlteracao());
            //aluno.setNotaFinal();
            return aluno;
        }      
        //return (Aluno) PessoaRepository.getPessoaPorId(idAluno);      
    }
}
