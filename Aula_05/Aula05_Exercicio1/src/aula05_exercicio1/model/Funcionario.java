
package aula05_exercicio1.model;

import java.util.Comparator;


public class Funcionario {
     
    private String nome;
    private String funcao;
    private String cargo;
  

    public Funcionario() {
    }

    public Funcionario(String nome, String funcao, String cargo) {
        this.nome = nome;
        this.funcao = funcao;
        this.cargo = cargo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    //font: https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
    
    public static Comparator<Funcionario> FuncionarioNomeComparator = new Comparator<Funcionario>() {

        //compara nome de um funcionario com outro e retorna a diferença entre as String nome
	public int compare(Funcionario func1, Funcionario func2) {
            String FuncionarioNome1 = func1.getNome().toUpperCase();
            String FuncionarioNome2 = func2.getNome().toUpperCase();

            //ascending order
            return FuncionarioNome1.compareTo(FuncionarioNome2);

            //descending order
            //return FuncionarioNome2.compareTo(FuncionarioNome1);
        }
    };


    //simplified
//  public static Comparator<Funcionario> FuncionarioNomeComparator = new Comparator<Funcionario>() {
//	public int compare(Funcionario func1, Funcionario func2) {           
//            return func1.getNome().compareToIgnoreCase(func2.getNome());
//      }
//  };
  
   // super simplified
   //public static Comparator<Funcionario> FuncionarioNomeComparator = (Funcionario func1, Funcionario func2) -> func1.getNome().compareToIgnoreCase(func2.getNome());
  
   
   
    @Override
    public String toString() {
        return "Funcionario: " + "nome = " + nome + ", funcao = " + funcao + ", cargo = " + cargo ;
    }


    
}
