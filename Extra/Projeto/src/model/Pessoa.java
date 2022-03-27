
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Rodrigo Vieira
 */
public class Pessoa {
    
    protected int id;
    protected String nome;
    protected String telefone;
    protected LocalDateTime dataNascimento;
    protected LocalDateTime dataCadastro;
    protected LocalDateTime dataAlteracao;

    public Pessoa() {
    }
    
    public Pessoa(int id, String nome, String telefone, LocalDateTime dataNascimento, LocalDateTime dataCadastro, LocalDateTime dataAlteracao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.dataAlteracao = dataAlteracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }   
}
