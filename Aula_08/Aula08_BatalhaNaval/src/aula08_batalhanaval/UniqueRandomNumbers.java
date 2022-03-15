
package aula08_batalhanaval;

import java.util.ArrayList;
import java.util.Collections;

//6 - Criando as peças
public class UniqueRandomNumbers {
    
    public final int TAMANHOLISTA = 10;
    
    private ArrayList<Integer> listX = new ArrayList<Integer>();
    private ArrayList<Integer> listY = new ArrayList<Integer>();

    
    //construtor
    public UniqueRandomNumbers() {
        for(int i=0; i<TAMANHOLISTA; i++){  //adiciona numeros de 0 a 9 a lista X
            listX.add(i);
            listY.add(i);
        }
        
        Collections.shuffle(listX);         //embaralha lista X criada
        Collections.shuffle(listY);         //embaralha lista Y criada

    }

    public ArrayList<Integer> getListX() {
        return listX;
    }

    public ArrayList<Integer> getListY() {
        return listY;
    }
   
    


}
