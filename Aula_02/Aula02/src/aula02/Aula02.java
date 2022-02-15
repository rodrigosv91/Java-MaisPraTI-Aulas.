
package aula02;

import aula02.model.Pedido;


public class Aula02 {

   
    public static void main(String[] args) {
       /*
       String       ClientePedido01 = "jao";
       double       valorPedido01 = 25.00;
       String[]     itenPedido01 = {"reffri", "xis"};
       
       String       ClientePedido02 = "mari";
       double       valorPedido02 = 25.00;
       String[]     itenPedido02 = {"reffri", "xis"};
       
        System.out.println("O cliente " + clientePedido01 + "compra" 
                + valorPedido01 + "e os items" + itenPedido01[0]
                + ", " + itenPedido01[1]);
         */
         
        Pedido pedido01 = new Pedido(); 
        pedido01.cliente = "Jao";
        pedido01.valor = 25.00;
        pedido01.itens[0] = "refri";
        pedido01.itens[1] =  "xis"; 
         
        System.out.println(pedido01.mensagemFinal());
        
        pedido01.recebeItemValor("ceva", 5.00);
        
        System.out.println(pedido01.toString());
         
    }
           
}
