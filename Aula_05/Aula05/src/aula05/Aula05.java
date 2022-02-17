
package aula05;

import aula05.model.Analista;
import aula05.model.Coordenador;
import aula05.model.Funcionario;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class Aula05 {

    public static void main(String[] args) {
        
        ArrayList<String> lista =  new ArrayList<String>();
        // List<String> lista =  new ArrayList<String>(); // polimorfismo
        
        LinkedList<String> lista2 = new LinkedList<String>();
        
        HashSet<String> lista3 = new HashSet<String>();
        
        /*
        lista.add("Jon");
        lista.add("Ken");
        lista.add("Fred");
        lista.add("Pin");
        
        lista2.add("Jon");
        lista2.add("Ken");
        lista2.add("Fred");
        lista2.add("Pin");
        
        lista3.add("Jon");
        lista3.add("Jon");  // não repete
        lista3.add("Ken");
        lista3.add("Fred");
        lista3.add("Pin");
        
        System.out.println(lista.get(0));
        
        System.out.println(lista2.getLast());
                
        System.out.println(lista3);
        */
        
        //Funcionario funcionario = new Funcionario(123, "Jon", "jon@jon"); //erro now asbtract
        Analista analista = new Analista("Mouse"); 
        
        analista.inserirNome("Jon", "Doe");
        
        System.out.println(analista.getSobrenome());
        
        System.out.println(analista.toString());
        //System.out.println(funcionario.getClass()); //erro now asbtrac
        
        
        
        //List<Analista> itens = new ArrayList<>();  // old
        List<Funcionario> itens = new ArrayList<>(); // new = analista também é uma implementação de funcionario ()
                                                     // TIPO MAIS GENERICO
        itens.add(analista); 
        
        System.out.println(itens);
        
        //itens.add(funcionario); // error , now asbtrac
        
        itens.forEach(f -> System.out.println(f)); // for each f item em itens -> sout
        
        Funcionario coordenador = new Coordenador( 5,  "Jon", "j@j", "TI");
        
        itens.add(coordenador);
        
        itens.forEach(f -> System.out.println(f));
        
        
        
        
    }
    
}
