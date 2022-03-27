
package utils;

import controller.Atualizar;
import controller.Cadastrar;
import controller.Mostrar;
import controller.Remover;
import java.time.LocalDateTime;
import java.util.Scanner;

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

    public static void executaOpcao(int opcao, Scanner sc) {
        
        switch(opcao){
            case 0:
                System.out.println("Encerrando...");
                //Thread.sleep(1000);
                break;
            case 1:
                //  view . cadastrar()
                cadastrar();
                break;
            case 2:
                // view mostrar
                mostrar();
                break;
            case 3:
                // atualizar
                atualizar();
                break;
            case 4:
                // deletar
                deletar();
                break;      
            default: 
                System.out.println("Opcão inválida, tente novamente.");
                
        }
    }

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);
        Cadastrar ctrlCadastrar = new Cadastrar();      
        boolean recebeuNota = false;
        double notaFinal = 0;
        
        System.out.println("Informe o nome:"); // validar nome?
        String nome = sc.nextLine();
        System.out.println("Informe o telefone:"); // validar telefone
        String telefone = sc.nextLine();
        System.out.println("Informe a data de nascimento:"); 
        String dataNascimento = sc.nextLine();  // validar data nascimento       
        System.out.println("Informe a nota final:");
        
        try {           
            notaFinal = Double.valueOf(sc.nextLine().replace(',', '.'));
            recebeuNota = true;             
        }catch (NumberFormatException e){}
        
        if(recebeuNota){
            ctrlCadastrar.cadastrarAluno(nome, telefone, LocalDateTime.MIN, notaFinal);
        }else{
            ctrlCadastrar.cadastrarPessoa(nome, telefone, LocalDateTime.MIN);
        }   
        //sc.close();
    }

    private static void mostrar() {
        Mostrar m = new Mostrar();
        m.mostrarTodos();
    }

    private static void atualizar() {
        Scanner sc = new Scanner(System.in);
        Atualizar ctrlAtualizar = new Atualizar();      
        boolean recebeuNota = false;
        double notaFinal = 0;
        
        System.out.println("Informe o número de identificação da pessoa ou aluno a ser atualizado:"); // validar int
        int id = sc.nextInt();   
        sc.nextLine();
        
        if(ctrlAtualizar.verificaSeExiste(id)){
            System.out.println("Informe o nome:"); // validar nome?
            String nome = sc.nextLine();
            System.out.println("Informe o telefone:"); // validar telefone
            String telefone = sc.nextLine();
            System.out.println("Informe a data de nascimento:"); 
            String dataNascimento = sc.nextLine();  // validar data nascimento       
            System.out.println("Informe a nota final:");

            try {           
                notaFinal = Double.valueOf(sc.nextLine().replace(',', '.'));
                recebeuNota = true;             
            }catch (NumberFormatException e){}

            if(recebeuNota){
                ctrlAtualizar.atualizarAluno(id, nome, telefone, LocalDateTime.MIN, notaFinal);
            }else{
                ctrlAtualizar.atualizarPessoa(id, nome, telefone, LocalDateTime.MIN);
            } 
        }else{
            System.out.println("Não há pessoa ou aluno com identificação: " + id);
        }
    }

    private static void deletar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de identificação da pessoa ou aluno a ser removido:");       
        int id = sc.nextInt();     // ToDo: VALIDAR
        
        Remover ctrlCadastrar = new Remover();
        ctrlCadastrar.removerPessoa(id);    
    }
      
}
