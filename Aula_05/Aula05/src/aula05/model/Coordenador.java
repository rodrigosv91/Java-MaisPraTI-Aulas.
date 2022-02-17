
package aula05.model;


public class Coordenador extends Funcionario{
    
    String departmanento;

 

    public Coordenador(int codigo,   String nome, String email, String departmanento) {
        super(codigo, nome, email);
        this.departmanento = departmanento;
    }

    @Override
    public int getCodigo() {
       return super.codigo;
    }

   
    
}
