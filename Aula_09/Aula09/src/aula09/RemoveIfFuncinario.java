
package aula09;

import java.util.function.Predicate;


public class RemoveIfFuncinario implements Predicate<Funcionario>{

    @Override
    public boolean test(Funcionario funcionario) {
        return funcionario.getSalario() > 1500.0;
    }
    
}
