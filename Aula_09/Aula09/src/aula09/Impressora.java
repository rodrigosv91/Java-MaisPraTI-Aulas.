
package aula09;

import java.util.List;


public class Impressora<T> {
    
    /*
    public static void mostrar(String string){
        System.out.println(string);
    }
    
    public static void mostrar(int i){
        System.out.println(i);
    }

    */
    /*
    public T mostrar(T t){

        return t;
    }
    */
    
    public void  mostrar(List<?> t){        
        //t.add("Jon"); //erro
        t.get(0);
    }
    
    
    
}
