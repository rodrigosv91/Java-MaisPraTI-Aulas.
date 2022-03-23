
package principal;

import dao.PessoaDAO;
import java.time.LocalDateTime;
import model.Aluno;
import model.Pessoa;
import repository.PessoaRepository;

/**
 *
 * @author Rodrigo Vieira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("jon jon jones", "telefone123", LocalDateTime.MIN, LocalDateTime.MAX, LocalDateTime.MAX);
        PessoaDAO pdao = new PessoaDAO();
        
        Aluno a = new Aluno("pen penn pom", "telefone99", LocalDateTime.MIN, LocalDateTime.MAX, LocalDateTime.MAX, 100);
        
        pdao.adicionar(p);
                 
        pdao.adicionar(a);
        Aluno alunoTest = (Aluno) PessoaRepository.getLista().get(1);
        
        System.out.println(PessoaRepository.getLista().get(0).getNome());
        System.out.println(alunoTest.getNotaFinal());
        
        PessoaRepository.remover(0);
        
        System.out.println(PessoaRepository.getLista().get(0).getNome());
    }
    
}
