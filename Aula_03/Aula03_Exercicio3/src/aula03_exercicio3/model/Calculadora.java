
package aula03_exercicio3.model;


public class Calculadora {
    
    public static String nome;
    
    public static void somar(int a, int b){     
        System.out.println( a + " + " + b + " = " + (a + b) );
    }
    
    public static void subtrair (int a, int b){
        System.out.println( a + " - " + b + " = " + (a - b) );
    }
    
    public static void multiplicar(int a, int b){
        System.out.println(a + " x " + b + " = " + (a*b));
    }
    
    public static void dividir(int a, int b){
        if(b == 0){
            System.out.println("Não é possivel dividir por zero");
        }else{
            System.out.println(a + " / " + b + " = " + (a/b));
        }
    }
    
    // carrega quando chama a classe (não quando importa) , instanciada ou não
    // carrega quando os bytecodes da classe são adicionados para a memória
    // ClassLoader at java.lang.ClassLoader
    static {
        System.out.println("Calculadora");
        System.out.println("O classloader carregou essa classe!!");
    } 
}
