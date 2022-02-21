
package com.mycompany.singleton.example.janela;

//source: https://refactoring.guru/pt-br/design-patterns/singleton/java/example

public class Singleton {
    
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
    
    
    
    
}
