
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
    
    public void MostrarTodos() {
        PessoaDAO dao = new PessoaDAO();
        ArrayList<Pessoa> lista = dao.buscarTodos();
        
        for(Pessoa p : lista){
            System.out.println("|Identificação: " + p.getId() + " | Nome: " + p.getNome());
            if(p instanceof Aluno){
                Aluno a = (Aluno) p;
                System.out.println("Nota Final  :   " + a.getNotaFinal());
            }
            System.out.println("------------------------------------------------------");
        }
        
    }
}
