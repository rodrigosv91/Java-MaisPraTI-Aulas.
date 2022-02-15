
package test1.model;


public class Ponto2D {
  protected int p1;
  protected int p2;
  
  public Ponto2D(int p1, int p2){
  	this.p1 = p1;
    this.p2 = p2;
  }
  protected int distancia() {                    
    	return this.p1 + this.p2;
  }
}
