
package utils;

import java.util.Scanner;
import static presenter.Atualizar.atualizar;
import static presenter.Cadastrar.cadastrar;
import static presenter.Mostrar.mostrar;
import static presenter.Remover.remover;

/**
 *
 * @author Rodrigo Vieira
 */
public class Menu {
    
    public static void menuPrincipal() {
        System.out.println("SISTEMA CRUD PESSOA/ALUNO");
        System.out.println("1 - Criar pessoa ou aluno");
        System.out.println("2 - Mostrar todas as pessoas e alunos");
        System.out.println("3 - Atualizar dados de uma pessoa ou aluno");
        System.out.println("4 - Deletar uma pessoa ou aluno");
        System.out.println("0 - Para sair");  
    }
    
    public static void limparTela() {
        System.out.print("\n");
    }

    public static void executaOpcao(int opcao, Scanner sc) {
        
        switch(opcao){
            case 0:
                System.out.println("\nEncerrando...");
                //Thread.sleep(1000);
                break;
            case 1:
                cadastrar(); 
                break;
            case 2:
                mostrar();  
                break;
            case 3:
                atualizar();
                break;
            case 4:
                remover();
                break;      
            default: 
                System.out.println("\nOpcão inválida, tente novamente.");
                limparTela();               
        }
    }
    /*
    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        Cadastrar ctrlCadastrar = new Cadastrar();      
        boolean recebeuNota = false;
        double notaFinal = 0;
        
        limparTela();
        System.out.println("Informe o nome:"); // validar nome?
        String nome = sc.nextLine();
        System.out.println("Informe o telefone:"); // validar telefone
        String telefone = sc.nextLine();
        System.out.println("Informe a data de nascimento [Formato: dd/mm/aaaa]:"); 
        String dataNascimento = validaDataNascimento(sc);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate localDateNascimento = LocalDate.parse(dataNascimento, format);
            
        System.out.println("Informe a nota final [se necessário]:");
        
        try {            
            notaFinal = Double.valueOf(sc.nextLine().replace(',', '.'));
            recebeuNota = true;             
        }catch (NumberFormatException e){}
        
        if(recebeuNota){
            ctrlCadastrar.cadastrarAluno(nome, telefone, localDateNascimento, notaFinal);  
        }else{
            ctrlCadastrar.cadastrarPessoa(nome, telefone, localDateNascimento);
        }   
    }
    
    public static void mostrar() {      
        Mostrar m = new Mostrar();
        m.mostrarTodos();
        limparTela();
    }
    
    public static void atualizar() {       
        Atualizar ctrlAtualizar = new Atualizar(); 
        if(!ctrlAtualizar.verificaSeVazia()){
            Scanner sc = new Scanner(System.in);
            boolean recebeuNota = false;
            double notaFinal = 0;

            System.out.println("Informe o número de identificação da pessoa ou aluno a ser atualizado:"); // validar int
            int id = validaInteiroAtualizar(sc);  
            sc.nextLine();

            if(ctrlAtualizar.verificaSeExiste(id)){
                System.out.println("Informe o nome:"); // validar nome?
                String nome = sc.nextLine();
                System.out.println("Informe o telefone:"); // validar telefone
                String telefone = sc.nextLine();
                System.out.println("Informe a data de nascimento [Formato: dd/mm/aaaa]:"); 
                String dataNascimento = validaDataNascimento(sc);  
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/uuuu");
                LocalDate localDateNascimento = LocalDate.parse(dataNascimento, format);
               
                System.out.println("Informe a nota final:");

                try {           
                    notaFinal = Double.valueOf(sc.nextLine().replace(',', '.'));
                    recebeuNota = true;             
                }catch (NumberFormatException e){}

                if(recebeuNota){
                    ctrlAtualizar.atualizarAluno(id, nome, telefone, localDateNascimento, notaFinal);
                }else{
                    ctrlAtualizar.atualizarPessoa(id, nome, telefone, localDateNascimento);
                } 
            }else{
                System.out.println("\nNão há pessoa ou aluno com identificação: " + id);
                limparTela();
            }
        }else{
            System.out.println("\nNão há pessoas ou alunos para atualizar.");
            limparTela();
        }
    }
    
    public static void remover() {
        Remover ctrlRemover = new Remover();
        
        if(!ctrlRemover.verificaSeVazia()){
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o número de identificação da pessoa ou aluno a ser removido:");       
            int id = validaInteiroRemover(sc);     

            ctrlRemover.removerPessoa(id);    
        }else{
            System.out.println("\nNão há pessoas ou alunos para remover.");
        }
        limparTela();
    }
    */  
}
