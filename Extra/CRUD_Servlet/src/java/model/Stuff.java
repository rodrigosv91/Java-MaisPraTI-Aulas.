
package model;

public class Stuff {
    private String nome;
    private String descricao;

    public Stuff() {
    }

    public Stuff(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Stuff{" + "nome=" + nome + ", descricao=" + descricao + '}';
    }
    
}
