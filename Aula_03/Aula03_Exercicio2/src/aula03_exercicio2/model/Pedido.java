
package aula03_exercicio2.model;


public class Pedido {
    
    private String[] itens = new String[10];
    private double valorTotal = 0;
    private Status status;          //enum
    
    public double getValorTotal(){
        return this.valorTotal;
    }
        
    public void setItem(String item, double valor){
        
        for(int i = 0; i < itens.length; i++){           
            if(itens[i] == null){
                itens[i] = item;
                valorTotal += valor;
                break;               
            }     
            if( i ==  (itens.length-1) ){
                System.out.println("Máximo de itens no pedido alcançado, crie um novo pedido");
            }
        }             
    }
          
    public void setStatus (String status){
        
        try{
        this.status = Status.valueOf(status.toUpperCase()); 
        // valueOf seta o valor de um enum retornando um dos valores ja existentes do nosso enum criado (Status)      
        }
        catch(Exception e) {
            System.out.println("Status invalido");
        }                
    }

    public Status getStatus() {
        return status;
    }

    public String[] getItens() {
        return itens;
    }
    
    
}
