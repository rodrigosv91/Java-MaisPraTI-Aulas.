
package aula05_exercicio1;

import aula05_exercicio1.model.Funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.*;

public class Aula05_Exercicio1 {

    
    public static void main(String[] args) {
        /*   
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
          System.out.println(i);
        }
        */  

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

        for(int i  = 1; i < 11; i++ ){                
            //Funcionario funcionario = new Funcionario("Jon"+i, "Analista"+i , "Programador"+i ); 
            //Funcionario funcionario = new Funcionario(); 
            //funcionario.setNome("Jon"+i);
            //funcionario.setFuncao("Analista"+i);
            //funcionario.setCargo("Programador"+i);          
            //lista.add(funcionario);
            
            lista.add(new Funcionario("Jon"+i, "Analista"+i, "Programador"+i));
        }
        
        lista.add(new Funcionario("Andre", "Gerente de projeto", "Tester"));

        //reordena em ordem alfabetica
        Collections.sort(lista, Funcionario.FuncionarioNomeComparator);
        
        for (Funcionario f :  lista){
             System.out.println(f.toString());
        }

    }
    
}


















