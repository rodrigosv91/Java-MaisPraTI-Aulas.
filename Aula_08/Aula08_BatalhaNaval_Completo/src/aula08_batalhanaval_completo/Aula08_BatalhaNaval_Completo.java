
package aula08_batalhanaval_completo;

import java.util.Scanner;

public class Aula08_BatalhaNaval_Completo {

    public static void main(String[] args) { 
     
        Scanner sc = new Scanner(System.in);
        Cenario mapa = new Cenario();
        String entrada;                 
        boolean continuarPartida = true; 
        
        while(continuarPartida){
            System.out.println("Entre x e y no formato 'x,y' ou FIM para encerrar");               
            entrada = Reader.validaEntrada(sc);
            if(entrada.equals("FIM") || entrada.equals("fim"))                
                break;                       
            String[] numeros = entrada.split(",");  
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);           
            System.out.println("x = " + x + ", e y = " + y);                     
            continuarPartida = mapa.calculaDisparoEDistanciaParaPecaMaisProxima(x, y);
            mapa.desenhaCenario();           
       } 
    }   
}
