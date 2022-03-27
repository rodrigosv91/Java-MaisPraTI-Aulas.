
package controller;

import dao.PessoaDAO;
import java.util.ArrayList;
import model.Aluno;
import model.Pessoa;

/**
 *
 * @author Rodrigo Vieira
 */
public class Mostrar {
    
    public void mostrarTodos() {
        PessoaDAO dao = new PessoaDAO();
        ArrayList<Pessoa> lista = dao.buscarTodos();
        
        if(!lista.isEmpty()){       
            for(Pessoa p : lista){
                System.out.println(String.format("|Identificação: %-5s  | Nome: %-5s", p.getId(),  p.getNome()));
                if(p instanceof Aluno){
                    Aluno a = (Aluno) p;
                    System.out.println(String.format("|Nota Final   : %.2f", a.getNotaFinal()));
                }
                System.out.println("------------------------------------------------------");
            }
        }
        else{
            System.out.println("Não há pessoas ou alunos na lista.");
        }
    }
}
