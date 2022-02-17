
package aula05.model;


public class Analista extends Funcionario{
    
    private String equipamento;

    
    public Analista(int codigo, String nome, String email) {
        super(codigo, nome, email);
    }
    
    public Analista(String equipamento) {
        this.equipamento = equipamento;
    }
 

    public int  getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void inserirNome(String nome, String sobrenome) {
        this.nome = nome;
        this.setSobrenome(sobrenome);
    }

    @Override
    public String toString() {
        return super.toString() +  " Analista{" + "equipamento=" + equipamento + '}';
    }
    
    
    
}
