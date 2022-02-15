
package aula03_exercicio2;

import aula03_exercicio2.model.Pedido;
import aula03_exercicio2.model.Status;


public class Aula03_Exercicio2 {

   
    public static void main(String[] args) {
        
        
        Pedido pedido = new Pedido();
        
        pedido.setStatus("AGUARDANDO");
        
        pedido.setItem("item 01", 5.0);
        pedido.setItem("item 02", 5.0);
        pedido.setItem("item 03", 5.0);
        pedido.setItem("item 04", 5.0);
        pedido.setItem("item 05", 5.0);
        pedido.setItem("item 06", 5.0);
        pedido.setItem("item 07", 5.0);
        pedido.setItem("item 08", 5.0);
        pedido.setItem("item 09", 5.0);
        pedido.setItem("item 10", 5.0);
        //pedido.setItem("item 11", 5.0);
        
        pedido.setStatus("EM_ANDAMENTO");
        
        for(String item : pedido.getItens()){
            System.out.println(item.toString()); 
        }
        
        System.out.println("valor total :" + pedido.getValorTotal());
        
        pedido.setStatus("FINALIZADO");
        
        System.out.println("Status :" + pedido.getStatus());
          
    }
    
}
