
package aula03_exercicio1;

import aula03_exercicio1.model.Aluno;
import java.util.Scanner;


public class Aula03_Exercicio1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        aluno.setNome("Jon");
        aluno.setMatricula("123654");       
        
        /* 
        //opcao 1
        
        aluno.setNota(0, 38);
        aluno.setNota(1, 35);
        aluno.setNota(2, 35);
      
        */
        
        //opcao 2
        
        //le nota testando se inseriu
        //se nao inseriu
        //duvidas: como sabe em qual posicao inseriu? (nota1, nota2 ou nota3?)
        //se pegar so nota (sem posicao), como saber em qual nota de Aluno.notas[] inseriu?
        
        
        
        
        System.out.println(aluno.toString());
        
        sc.close(); 
    }
    
}
