
package com.mycompany.singleton.example.janela;


public class Main {
    
    public static void main(String[] args) {
       /*
       System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
        
        */
       
        Janela janela =  Janela.getInstance();
        Janela outraJanela =  Janela.getInstance();
        
        System.out.println(janela);
        System.out.println(outraJanela); // amabas mesma instancia
        
        Janela2 janela2 =  Janela2.getInstance();
        Janela2 outraJanela2 =  Janela2.getInstance();
        
        System.out.println(janela2);
        System.out.println(outraJanela2); // amabas mesma instancia
        
        
        
        //resume: pode ser ser feito quando instancia ou em getInstance
    }
}
