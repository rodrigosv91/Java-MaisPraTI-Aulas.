
package controller;

import dao.AlunoDAO;
import dao.PessoaDAO;
import java.time.LocalDateTime;
import model.Aluno;
import model.Pessoa;
import repository.PessoaRepository;

/**
 *
 * @author Rodrigo Vieira
 */
public class Atualizar {
    
    public void atualizarPessoa(int id, String nome, String telefone, LocalDateTime dataNascimento) {
        
        Pessoa pessoa = PessoaRepository.getPessoaPorId(id);
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setDataNascimento(dataNascimento); 
        pessoa.setDataAlteracao(LocalDateTime.now()); 
        
        PessoaDAO pDao = new PessoaDAO();
        pDao.atualizar(pessoa); 
    }
    
    public void atualizarAluno(int id, String nome, String telefone, LocalDateTime dataNascimento, double notaFinal) {
        
        Aluno aluno = (Aluno) PessoaRepository.getPessoaPorId(id);
        aluno.setNome(nome);
        aluno.setTelefone(telefone);
        aluno.setDataNascimento(dataNascimento); 
        aluno.setDataAlteracao(LocalDateTime.now()); 
        aluno.setNotaFinal(notaFinal);
        
        AlunoDAO aDao = new AlunoDAO();
        aDao.atualizar(aluno); 
    }
        
}
