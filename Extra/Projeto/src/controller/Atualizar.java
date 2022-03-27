
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
        
        PessoaDAO pDao = new PessoaDAO();       
        Pessoa pessoa = pDao.buscarPessoa(id);
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setDataNascimento(dataNascimento); 
        pessoa.setDataAlteracao(LocalDateTime.now());               
        pDao.atualizar(pessoa); 
    }
    
    public void atualizarAluno(int id, String nome, String telefone, LocalDateTime dataNascimento, double notaFinal) {
        
        AlunoDAO aDao = new AlunoDAO();
        PessoaDAO pDao = new PessoaDAO();        
        Aluno aluno = aDao.buscarAluno(id);
        aluno.setNome(nome);
        aluno.setTelefone(telefone);
        aluno.setDataNascimento(dataNascimento); 
        aluno.setDataAlteracao(LocalDateTime.now()); 
        aluno.setNotaFinal(notaFinal);             
        aDao.atualizar(aluno); 
        
    }
    
    public boolean verificaSeExiste(int id) {
        PessoaDAO pDao = new PessoaDAO();        
        return pDao.buscarTodos().contains(pDao.buscarPessoa(id));      
    }
        
}
