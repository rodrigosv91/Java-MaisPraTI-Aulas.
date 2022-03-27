
package principal;

import java.util.Scanner;
import utils.Menu;

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
        //pdao.buscarTodos().forEach((k, v) -> {
        //    System.out.format("key: %s, value: %d%n", k, v);
        //});
        /*
        System.out.println(PessoaRepository.getLista().get(p.getId()).getNome());
        System.out.println(alunoTest.getNotaFinal());
       
        PessoaRepository.remover(p.getId());
        */
        //System.out.println(PessoaRepository.getLista().get(a.getId()).getNome());
        //System.out.println(PessoaRepository.getLista().get(p.getId()).getNome());
        /*
        Cadastrar cad = new Cadastrar();
        
        cad.cadastrarPessoa("nome1", "telefone1", LocalDateTime.MIN);
        cad.cadastrarAluno("nome2", "telefon2e", LocalDateTime.MIN, 100);
        
        PessoaDAO pdao = new PessoaDAO();
        
        for(Pessoa pe : pdao.buscarTodos()){
            System.out.println(pe.getNome());
            if(pe instanceof Aluno ){
                Aluno al = (Aluno) pe;
                System.out.println("Nota: " + al.getNotaFinal());
            }
        }
        */
        
        //ler opcao
        //verificar se opcao valida ou opcao de sair
        //se opcao valida realizar procedimento escolhido (ou se sair encerrar)
        //repete 
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        do{
            Menu.menuPrincipal();
            //if(sc.hasNextInt())
            opcao = sc.nextInt();   //READER
            
            Menu.executaOpcao(opcao, sc); 
            
        }while(opcao != 0);
         
        sc.close();
        
    }
    
}
