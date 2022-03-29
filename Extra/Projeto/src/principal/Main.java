
package principal;

import java.util.Scanner;
import utils.Menu;
import static utils.Menu.limparTela;
import static utils.Reader.validaInteiroMenu;

/**
 *
 * @author Rodrigo Vieira
 */
public class Main { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Pessoa p = new Pessoa(Contador.next(), "jon jon jones", "telefone123", LocalDateTime.MIN, LocalDateTime.MAX, LocalDateTime.MAX);
        PessoaDAO pdao = new PessoaDAO();
        
        Aluno a = new Aluno(Contador.next(), "pen penn pom", "telefone99", LocalDateTime.MIN, LocalDateTime.MAX, LocalDateTime.MAX, 100);
        
        pdao.adicionar(p);
                 
        pdao.adicionar(a);
        Aluno alunoTest = (Aluno) PessoaRepository.getLista().get(a.getId());
        
        /*
        for(Pessoa pe : pdao.buscarTodos()){
            System.out.println(pe.getNome());
            if(pe instanceof Aluno ){
                Aluno al = (Aluno) pe;
                System.out.println("Nota: " + al.getNotaFinal());
            }
        }
        */
        /*
        System.out.println(PessoaRepository.getLista().get(p.getId()).getNome());
        System.out.println(alunoTest.getNotaFinal());
       
        PessoaRepository.remover(p.getId());
        */  

        Scanner sc = new Scanner(System.in);
        int opcao = 0;        
        do{          
            Menu.menuPrincipal();
            System.out.print("\nDigite a opção: ");
            opcao = validaInteiroMenu(sc);                 
            Menu.executaOpcao(opcao, sc);             
        }while(opcao != 0);         
        sc.close();       
    }
    
}
