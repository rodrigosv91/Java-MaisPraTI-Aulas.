
package aula08_batalhanaval_completo;

import java.util.Random;

public class Pecas {
    private int x;
    private int y;   
    private boolean vivo;

    public Pecas() {
        Random aleatorio = new Random();
        this.x = aleatorio.nextInt(10);
        this.y = aleatorio.nextInt(10);      
        this.vivo = true;
    }
     
    public double disparo(int xA,  int yA){
        double distancia = Math.sqrt(Math.pow((this.x -xA), 2) + Math.pow((this.y -yA), 2));
        if(distancia == 0)
            this.vivo = false;       
        return distancia;
    }
    
    public boolean isVivo() {
        return vivo;
    }
}
