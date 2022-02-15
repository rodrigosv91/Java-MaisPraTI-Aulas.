
package aula03_exercicio1.model;


public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[3];
    //private double totalNotas = 0; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean setNota(int notaPosicao, double nota) {

         double totalNotas = 0; 
         
         for(int i = 0; i < this.notas.length; i++){
             if(i == notaPosicao){
                 totalNotas = totalNotas + nota;
             }else{
                 totalNotas = totalNotas + this.notas[i];
             }    
         }
        
        if( totalNotas > 100 ){
            System.out.println("Nao foi possivel adicionar a nota, tente adicionar novamente");     
            return false;
        }else{
            //System.out.println(totalNotas);
            this.notas[notaPosicao] = nota;
            return true;
        } 
    }
    
    public String getNotasToString (){
        
        String notaString = " ";
        
        for(double nota : this.notas){
            
            notaString = notaString + nota + ", "; 
        }
        
        notaString =  notaString.substring(0, notaString.length()- 2);
        
        return notaString;
    }
    
    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", notas=" + this.getNotasToString() + '}';
    }

    
}
