
package aula02.model;


public class Pedido {
    
    public String cliente;
    public double valor;
    public String[] itens =  new String[3];
    
    //contrutor 1 (já criado por java se nenhum construtor é definido)
    public Pedido(){}
    
    //contrutor 2
    public Pedido(String cliente, double valor, String item1, String item2){
        this.cliente = cliente;
        this.valor = valor;
        this.itens[0] = item1;
        this.itens[1] = item2;
    }
    
    //contrutor 3 (overload / sobrecarga)
    public Pedido(String cliente){
        this.cliente = cliente;
    }
           
    
    //metodo
    public String mensagemFinal(){
        String texto =   "O cliente " + cliente + " compra " 
                        + valor + " e os items " + itens[0]
                        + ", " + itens[1] + ", " + itens[2];
        return texto;
    }
    
    //adiciona item no primeiro lugar vazio do array
    public void recebeItemValor(String item, double valor){
        this.valor = valor;
    
        for(int i=0; i < this.itens.length; i++){ // erro: for(String itemA : itens)
            if(itens[i] == null){    
                itens[i] = item;
                break;
            }
        }
    }

    //retorna itens do array em string unica e "remove ultima vifgula"
    public String retornaItems(){
        String itensLista = " ";
        for(String item : this.itens){
            itensLista += item + ", "; // itensLista = itensLista + item + ", "; 
        }
        itensLista =  itensLista.substring(0, itensLista.length()- 2); //remove ultima virgula (poderia ser feito um teste para ver se era ultima interação tambem)
        return itensLista;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", valor=" + valor + retornaItems();
    }
    
    
}
