
package aula05_exercicio2;

import aula05_exercicio2.model.Humano;
import aula05_exercicio2.model.Cachorro;
import aula05_exercicio2.model.Galo;
import aula05_exercicio2.model.Gato;
import aula05_exercicio2.model.Gorila;
import aula05_exercicio2.model.Pato;

public class Aula05_Exercicio2 {

    
    public static void main(String[] args) {
       
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
        
    }
    
}
