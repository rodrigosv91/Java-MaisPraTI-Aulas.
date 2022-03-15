
package aula08_batalhanaval;

import java.util.ArrayList;
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
     
    //6 - Criando as peças
    public Pecas(int i){
        UniqueRandomNumbers urn = new UniqueRandomNumbers();

        ArrayList<Integer> listaX = urn.getListX();
        ArrayList<Integer> listaY = urn.getListY();
        
        this.x = listaX.get(i);
        this.y = listaY.get(i);
        
        this.vivo = true;
    }
    
    //7 - Calculando as distâncias 
    public double disparo(int xA,  int yA){// old: calculaDistancia
        //double distancia = Math.sqrt((x - this.x) * (x - this.x)) + ((y - this.y)+(y - this.y)));
        double distancia = Math.sqrt(Math.pow((this.x -xA), 2) + Math.pow((this.y -yA), 2));
        
        //8 - Eliminando as peças 
        if(distancia == 0)
            this.vivo = false;
        
        return distancia;
    }
    
    /*
    //7 - Calculando as distâncias
    public double disparo(int xA, int xB, int yA, int yB){
        return Math.sqrt(Math.pow((xB -xA), 2) + Math.pow((yB -yA), 2));
    }
    
    public double calculaDistanciaParaPecaMaisProxima(Pecas[] pecas, int x, int y){
        double[] arrayDistancias = new double[5];

        for(int i = 0; i < pecas.length; i++){          
            arrayDistancias[i] = disparo(pecas[i].getX(), pecas[i].getY(), x, y);
        }              
        Arrays.sort(arrayDistancias);
        return arrayDistancias[0];
    }
    */
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    
    
    
  
}
