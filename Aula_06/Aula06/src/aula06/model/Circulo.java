
package aula06.model;


public class Circulo implements Forma{

    private double diametro;
    

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    
    
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    
    
    
    @Override
    public double area() {
        double raio = getDiametro() / 2;
        
        return Math.PI * (raio* raio);
    }
    
}
