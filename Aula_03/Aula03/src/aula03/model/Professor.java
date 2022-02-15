
package aula03.model;


public class Professor {
    private String nome;
    private String materia;
    
    private Aluno aluno;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", materia=" + materia + ", aluno=" + aluno.getNome() + '}';
    }
    
    
    
}
