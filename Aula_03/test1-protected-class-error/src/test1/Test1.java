
package test1;

import test1.model.Ponto2D;
import test1.model.Ponto3D;

public class Test1 {

    
    public static void main(String[] args) {
        
    	Ponto2D p1 = new Ponto2D(10,10);
	Ponto3D p2 = new Ponto3D(10,10,10);
	System.out.println(p1.distancia());
	System.out.println(p2.distancia());
        
    }
    
}
