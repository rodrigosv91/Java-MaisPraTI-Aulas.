
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Rodrigo Vieira
 */
public class Aluno extends Pessoa{
    
    private double notaFinal;

    public Aluno() {
    }

    public Aluno(String nome, String telefone, LocalDateTime dataNascimento, LocalDateTime dataCadastro, LocalDateTime dataAlteracao, double notaFinal) {
        super(nome, telefone, dataNascimento, dataCadastro, dataAlteracao);
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
}
