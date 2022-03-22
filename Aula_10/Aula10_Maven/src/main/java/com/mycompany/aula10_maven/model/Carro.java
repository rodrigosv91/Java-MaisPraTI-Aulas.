
package com.mycompany.aula10_maven.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
//or
@Data   //getter and setter juntos
public class Carro {
    private String status;
    private double valor;
    
}
