
package com.mycompany.singleton.example.janela;

//source: https://www.devmedia.com.br/trabalhando-com-singleton-java/23632

public class Janela {
    
    //atributos (variaveis) que NÃO! serao "visiveis" fora da classe
    private static final Janela INSTANCE = new Janela();
    private static final String Teste = "Ola Singleton";
    
    //atributos (variaveis) publicos que são visivei em qualquer lugar do sistema
    public static final String  SingleTon = "Visivel fora da classe";
    
    //Contrutor PRIVADO
    private Janela () {
        //Operações de inicialização da classe
    }
    
    //Metodo publico estático  realizando o primeiro e único acesso necessário nesse tipo de aplicação
    //Garente uma única instancia
    public static Janela getInstance(){
        return INSTANCE;
    }
        
    //Metodo executavel de qualquer lugar do projeto
    public static void Abrir(){
        System.out.println("Abriu a Janela....");
    }
    
    //Metodo executavel de qualquer lugar do projeto
    public static void Fechar(){
        System.out.println("Fechou a Janela....");
    }
    
}
