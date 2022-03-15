
package aula08_batalhanaval;

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
        //this.mapa[1][1] = 1;
        //this.mapa[2][2] = 2;
        this.desenhos = new String[] {".","X","*"}; // posicao[0]= "." , posicao[1]= "X" , posicao[2]= "*"
        this.inimigos = new Pecas[TAMANHOPECAS];
        
        for(int i=0; i<5; i++){
            this.inimigos[i] = new Pecas(); 
            //this.inimigos[i] = new Pecas(i); 
        }
    }
    
    public void desenhaLinha(int[] linha){        
        String strLinha = "";     
        
        for(int celula : linha){
            
            //strLinha += celula;
            
            /*//4 - Desenhar  '.', 'X', ou '*')
            if(celula == 0){                
                strLinha += ". ";
            }
            else if(celula == 1){
                strLinha += "x ";
            }
            else if(celula == 2){
                strLinha += "* ";
            }
            */       
            
            strLinha += this.desenhos[celula] + "  "; // conteudo de array (0,1,2) bate com posicoes do array "desenhos"
                
        }              
        System.out.println(strLinha);         
    }
    
    public void desenhaCenario(){
        for(int[] linha : this.mapa){
            this.desenhaLinha(linha);
        }
        
        for(int i=0; i<5; i++){
            System.out.println(i+1 + ") x = " + this.inimigos[i].getX() +", y = "+  this.inimigos[i].getY());
        }
        
        System.out.println("Peças restantes: " + this.contadorInimigos);
        System.out.println("Tiros restantes: " + this.contadorDisparos);
    }
    
    public void alterarMapa(int x, int y){ // disparo()
        this.mapa[x][y] = 1;
    }

    //7 - Calculando as distâncias 
    public boolean calculaDisparoEDistanciaParaPecaMaisProxima(int x, int y){ //old: double
        this.contadorDisparos--;
        
        double[] arrayDistancias = new double[5];
        arrayDistancias[0] = 100;       
        
        for(int i = 0; i < inimigos.length; i++){ 
            arrayDistancias[i] = 100;
        } 
        
        for(int i = 0; i < inimigos.length; i++){ 
            //8 - Eliminando as peças 
            if(inimigos[i].isVivo()){
                arrayDistancias[i] = inimigos[i].disparo(x, y); //calcula Distancia, se zero coloca 100, se não zero coloca a distancia calculada
            }
        }              
        Arrays.sort(arrayDistancias);
        
        System.out.println("================================================");
        System.out.println("Distancia mais proximo vivo: " + arrayDistancias[0]);
        System.out.println("================================================");
        
        //8 - Eliminando as peças 
        //if(!(this.mapa[x][y] == 1 || this.mapa[x][y] == 2))
            this.mapa[x][y] = (arrayDistancias[0]>0) ? 1 : 2; //se distancia foi maior que zero altera mapa para desenho 1, se zero (acerto) altera para 2
        
        contadorInimigos = this.contarPecasRestantes();   
            
            
        return ((this.contadorInimigos > 0) && (this.contadorDisparos > 0));   //se um dos 2 for zero, jogo acabou
        //return arrayDistancias[0];
    }   
    
    
    public int contarPecasRestantes(){ // void
        int cont = 0;
        for(Pecas p : inimigos){
                if(p.isVivo())
                    cont++;
        }         
        return cont;
        //contadorInimigos = cont; 
    }   
   
}
