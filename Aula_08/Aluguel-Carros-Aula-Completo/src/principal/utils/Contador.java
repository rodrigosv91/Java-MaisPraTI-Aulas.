package principal.utils;

public class Contador {
    private static int cont = 0;
    
    public static int next(){
        cont++;
        return cont;
    }
}
