
package aula05_exercicio2.model;
        
import aula05_exercicio2.model.util.PlayWavFile;

public class Pato extends Animal{ 
  
    @Override
    public void fazerSom() {
        
        System.out.println("Quack! (com som)");
        
        PlayWavFile pwf = new PlayWavFile(); 
        
        pwf.reproduzSom(1);
            
    }
    
}
