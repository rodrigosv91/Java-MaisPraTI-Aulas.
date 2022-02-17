
package aula05.model;


public abstract class Funcionario {

        
    protected int codigo;
    
    protected String nome;
    
    protected String email;
    
    protected String sobrenome;
    
    public Funcionario(){    
    
    }
    
    public Funcionario(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }
    

    //public  int getCodigo() {
    //   return codigo;
    //}

    public abstract int getCodigo();
      

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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void inserirNome(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", sobrenome=" + sobrenome + '}';
    }
    
    
    
}
