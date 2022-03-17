
package aula09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Aula09 {

   
    public static void main(String[] args) {
        /*
        //Generics
        List list = new ArrayList();
        //List<String> list = new ArrayList();
         
        list.add("Arvore");
        list.add(9);
        
        
        Impressora<Integer> impressora1 = new Impressora();  
        Impressora<String> impressora2 = new Impressora();  
        
        
        System.out.println(impressora1.mostrar(1));
        System.out.println(impressora2.mostrar("JON"));
        */
        
        
        List<Funcionario> list = new ArrayList();
        list.add(new Funcionario("Jon", 10000.5));
        list.add(new Funcionario("Mary", 1500.5));
        
        /*
        System.out.println(list.size());

        list.removeIf(new RemoveIfFuncinario());
        
        System.out.println(list.size());
        */
        /*
        //Lambda Expressions
        // lista sabe que lista é de funcionarios (List<Funcionario>)
        list.removeIf( (funcionario) -> funcionario.getNome().equals("Jon"));  // RemoveIfFuncinario . test() em uma linha
        //list.removeIf( (funcionario) -> funcionario.getSalario() <= 1500.0 );

        for(Funcionario f :  list){
            System.out.println(f.getNome());
        }
        
        
        //list.forEach(new ForEachFuncionario());
        list.forEach(funcionario -> System.out.println(funcionario.getNome())); // mesma operaçao, menos codigo e sem classe especifica so para isso
        */
        
        //Stream
        /*
        int[] array = {9,8,1,3,1,5,8};
        
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        //Arrays.stream(array).forEach(i -> System.out.println(i));
        //Arrays.sort(array);
        //Arrays.stream(array).forEach(i -> System.out.println(i));
        
        List<Integer> list2 =  Arrays.stream(array).boxed().collect(Collectors.toList());
        /*
        list2.add(2344);
        list2.forEach(System.out::println);
        
        
        Arrays.stream(array).filter( (i) -> i > 5).forEach(System.out::println);
        Arrays.stream(array).filter( (i) -> i > 5).count();
        
        */
         
        List<String> names = new ArrayList<String>();
    	names.add("Jai");
    	names.add("Mahesh");
    	names.add("Ajay");
    	names.add("Hemant");
    	names.add("Vishal");
        
    	//Using Stream and Lambda expression
    	long count = names.stream().filter( (str) -> str.length() < 5).count();
        System.out.println(count+" strings with length less than 5");
        
    }
    
}
