
package test1.model;


public class Ponto3D extends Ponto2D {
  private int p3; 
  
  public Ponto3D(int p1, int p2, int p3){
  		super(p1, p2);
        this.p3 = p3;
  }
  protected int distancia() {                    
    	return this.p1 + this.p2 + this.p3;
  }
  
  
}
