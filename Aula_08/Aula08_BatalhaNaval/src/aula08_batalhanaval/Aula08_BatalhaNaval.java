
package aula08_batalhanaval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Aula08_BatalhaNaval { 

  
    public static void main(String[] args) {
       
       boolean continuarPartida = true;
        
       Scanner sc = new Scanner(System.in);
       Cenario mapa = new Cenario();
       String entrada;
       
       
       while(continuarPartida){
            System.out.println("Entre x e y no formato 'x,y' ou FIM");
           
            entrada = sc.nextLine();
            
            if(entrada.equals("FIM") || entrada.equals("fim"))                
                break; 
                        
            String[] numeros = entrada.split(",");  //onde houver "," (virgula)  divide em outra String
            int x = Integer.parseInt(numeros[0]);
            int y = Integer.parseInt(numeros[1]);
            
            System.out.println("x = " + x + ", y = " + y); 
            

           
            /*//3 - desenhar array
            char[][] array = new char[10][10];
            
            for(int i = 0; i < 10; i++ ){           
                for(int z = 0; z < 10; z++ ){
                    array[i][z] = '.';
                }
            }
            
            array[2][6] = 'x';
           
            for(int i = 0; i < 10; i++ ){           
                for(int z = 0; z < 10; z++ ){
                    System.out.print(array[i][z] + " ");
                }
                System.out.println();
            }
            /*
            for (char[] row : array){
               for (char colum : row){
                    System.out.print(colum + "  ");
               }
               System.out.println();
            } */
            
            //5 - Alterar Mapa 
            //mapa.alterarMapa(x, y);  // disparo()
            
            
            
            
            /*//6 - Criando as peças
            UniqueRandomNumbers rn = new UniqueRandomNumbers();
            
            List ram5X = rn.getListX();
            List ram5Y = rn.getListY();
            
            for(int i = 0; i < 5; i++ ){           
                mapa.alterarMapa((int) ram5X.get(i), (int) ram5Y.get(i)); 
            }
            mapa.desenhaCenario();
            */
            
            continuarPartida = mapa.calculaDisparoEDistanciaParaPecaMaisProxima(x, y);

            mapa.desenhaCenario();
            
       }      
    }
    
}
