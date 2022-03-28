
package controller;

import dao.PessoaDAO;
import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        if(!lista.isEmpty()){       
            for(Pessoa p : lista){
                System.out.println(String.format("|Identificação: %-5s  | Nome: %-5s | Data Nascimento: %-5s", p.getId(),  p.getNome(), p.getDataNascimento().format(fmt)));
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
