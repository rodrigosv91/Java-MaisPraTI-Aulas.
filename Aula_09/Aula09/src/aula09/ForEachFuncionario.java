
package aula09;

import java.util.function.Consumer;


public class ForEachFuncionario implements  Consumer<Funcionario>{

    @Override
    public void accept(Funcionario f) {
        System.out.println(f.getNome());
        
        }
    
    
    
    
}
