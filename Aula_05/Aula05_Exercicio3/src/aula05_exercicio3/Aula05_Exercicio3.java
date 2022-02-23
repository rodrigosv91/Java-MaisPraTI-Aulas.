
package aula05_exercicio3;

import java.lang.*;

import aula05_exercicio3.model.Administrador;
import aula05_exercicio3.model.Contador;
import aula05_exercicio3.model.Funcionario;
import aula05_exercicio3.model.Programador;
import java.util.ArrayList;
import java.util.List;

public class Aula05_Exercicio3 {

    
    public static void main(String[] args) {
       
        Programador programador = new Programador("Jon");
        programador.setTotalHoras(10);
        programador.setValorHora(10); 
        
        Contador contador = new Contador("Ken",10,10);
        
        Administrador admin = new Administrador("Pet",10,10);
        
        
        System.out.println(programador.getNome() + ": " + programador.valorTotalAReceber());
        System.out.println(contador.getNome() + ": " + contador.valorTotalAReceber());
        System.out.println(admin.getNome() + ": " + admin.valorTotalAReceber());
        
        
        List<Funcionario> funcionarios = new ArrayList<>(); 
        
        
        funcionarios.add(programador);
        funcionarios.add(programador);
        
    }
    
}
