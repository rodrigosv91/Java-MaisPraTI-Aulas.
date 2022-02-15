
package aula02_exercicio2.model;

/**
 *
 * @author Rodrigo
 */
public class Aluno {
    
    public String nome;
    public double[] notas = new double[3];
    
    public String getNome(){
        return this.nome;
    }
    
    public void setName(String nome){
        this.nome = nome;
    }
 
    public boolean adicionaNotas(double n1, double n2, double n3){
        //se total menor que 100
        if(n1+n2+n3 <= 100){
            this.notas[0] = n1;
            this.notas[1] = n2;
            this.notas[2] = n3;
            return true;
        }
        //erro
        return false;           
    }
    
    public double getMedia(){
        return ((this.notas[0] + this.notas[1] + this.notas[2]) / 3);
    }
  
    public double getMenorNota(){
        double menorNota = this.notas[0];
        for(int i=0; i < this.notas.length; i++){
            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
        }
        return menorNota;
    }
    
    public double getMaiorNota(){
        double maiorNota = this.notas[0];
        for(int i=0; i < this.notas.length; i++){
            if(notas[i] > maiorNota){
                maiorNota = notas[i];
            }        
        }
        return maiorNota;
    }
    
    public String retornaTudo (){
        return  "Nome aluno: " + this.nome +
                "\nMédia: " + getMedia() +
                "\nMenor nota: " + getMenorNota() +
                "\nMaior nota: " + getMaiorNota();
    }
    
}
