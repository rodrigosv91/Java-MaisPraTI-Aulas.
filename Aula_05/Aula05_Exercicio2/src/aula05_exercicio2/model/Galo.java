
package aula05_exercicio2.model;

import aula05_exercicio2.model.util.PlayWavFile;


public class Galo extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("Cocoricó! (com som)");
        
        PlayWavFile pwf = new PlayWavFile();
        
        pwf.reproduzSom(2);
    }
    
}
