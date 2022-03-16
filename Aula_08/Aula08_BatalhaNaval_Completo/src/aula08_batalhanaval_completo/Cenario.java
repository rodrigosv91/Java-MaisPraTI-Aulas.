
package aula08_batalhanaval_completo;

import java.util.Arrays;

public class Cenario {
    
    private int[][] mapa;
    public final int TAMANHOPECAS = 5; // inimigos
    public final int TAMANHODISPAROS = 25; // disparos
    private final int ROW = 10;
    private final int COLLUM = 10;
    private String[] desenhos;
    private Pecas[] inimigos;   
    private int contadorInimigos;
    private int contadorDisparos;
    
    public Cenario(){
        this.contadorInimigos = TAMANHOPECAS;
        this.contadorDisparos = TAMANHODISPAROS;
        this.mapa = new int[ROW][COLLUM];
        this.desenhos = new String[] {".","X","*"}; 
        this.inimigos = new Pecas[TAMANHOPECAS];
        
        for(int i=0; i<5; i++){
            this.inimigos[i] = new Pecas(); 
        }
    }
    
    public void desenhaLinha(int[] linha){        
        String strLinha = "";     
        
        for(int celula : linha){  
            strLinha += this.desenhos[celula] + "  "; // conteudo de array (0,1,2) bate com posicoes do array "desenhos"       
        }              
        System.out.println(strLinha);         
    }
    
    public void desenhaCenario(){
        for(int[] linha : this.mapa){
            this.desenhaLinha(linha);
        }       
        System.out.println("Peças restantes: " + this.contadorInimigos);
        System.out.println("Tiros restantes: " + this.contadorDisparos);
    }
    
    public boolean calculaDisparoEDistanciaParaPecaMaisProxima(int x, int y){ //old: double
        this.contadorDisparos--;      
        double[] arrayDistancias = new double[5];
        arrayDistancias[0] = 100;       
        
        for(int i = 0; i < inimigos.length; i++){ 
            arrayDistancias[i] = 100;
        }        
        for(int i = 0; i < inimigos.length; i++){ 
            if(inimigos[i].isVivo()){
                arrayDistancias[i] = inimigos[i].disparo(x, y); 
            }
        }              
        Arrays.sort(arrayDistancias);
        //if(!(this.mapa[x][y] == 1 || this.mapa[x][y] == 2))
        this.mapa[x][y] = (arrayDistancias[0]>0) ? 1 : 2; 
        
        System.out.println("================================================");
        System.out.println("Distancia mais proximo vivo: " + arrayDistancias[0]);
        System.out.println("================================================");

        contadorInimigos = this.contarPecasRestantes();   

        return ((this.contadorInimigos > 0) && (this.contadorDisparos > 0));  
    }   
       
    public int contarPecasRestantes(){ // void
        int cont = 0;
        for(Pecas p : inimigos){
                if(p.isVivo())
                    cont++;
        }         
        return cont;
    }    
}
