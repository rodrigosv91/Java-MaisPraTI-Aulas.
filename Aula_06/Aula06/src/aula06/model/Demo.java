
package aula06.model;

import java.io.IOException;


public class Demo {
    
    public void first() throws IOException  {  
        throw new IOException("error");  
    }  
    public void second() throws IOException {  
        first();  
    }  
    public void third() {  
        try {  
            second();  
        } 
        catch (Exception e) {  
            System.out.println("work is done");  
        }     
    }
}