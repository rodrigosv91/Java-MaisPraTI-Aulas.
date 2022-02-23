
package aula05_exercicio2;

import aula05_exercicio2.model.Animal;
import aula05_exercicio2.model.Humano;
import aula05_exercicio2.model.Cachorro;
import aula05_exercicio2.model.Galo;
import aula05_exercicio2.model.Gato;
import aula05_exercicio2.model.Gorila;
import aula05_exercicio2.model.Pato;
import java.util.ArrayList;
import java.util.List;

public class Aula05_Exercicio2 {

    
    public static void main(String[] args) {
       
        /*
        Humano humano = new Humano();  
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro(); 
        Gorila gorila = new Gorila();
        Pato pato = new Pato();
        Galo galo = new Galo();      
        
        humano.fazerSom();
        gato.fazerSom();
        cachorro.fazerSom();
        gorila.fazerSom();
        pato.fazerSom();
        galo.fazerSom();
        
        */
        
        List<Animal> animais = new ArrayList<>();
        
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        
       animais.add(gato);     
       animais.add(cachorro);
           
       for (Animal animal : animais){
           animal.fazerSom();
       }
        
        
    }
    
}
