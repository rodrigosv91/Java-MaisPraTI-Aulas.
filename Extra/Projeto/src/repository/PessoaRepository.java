
package repository;

import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Rodrigo
 */
public class PessoaRepository {
    
    public static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public static void inserir(Pessoa pessoa) {
        lista.add(pessoa);
    }
    
    public static void atualizar(int posicao, Pessoa pessoa) {
        lista.set(posicao, pessoa);
    }
      
    public static void remover(int posicao) {
        lista.remove(posicao);
    }

    public static ArrayList<Pessoa> getLista() {
        return lista;
    }
    
}
