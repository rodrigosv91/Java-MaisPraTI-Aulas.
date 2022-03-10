
package principal.service;

import java.util.List;
import java.util.stream.Collectors;
import principal.enuns.StatusCarro;
import principal.model.Carro;
import principal.model.repository.CarroRepository;
import principal.utils.Contador;


public class CarroService {

    public static void mostrarCarros() {
        System.out.println("teste");
        List<Carro> carrosLivres = CarroRepository.listar().stream().filter(carro -> carro.getStatus().equals("LIVRE"))
                                    .collect(Collectors.toList());
        for(Carro carro : carrosLivres){
            System.out.println(carro.getId() + " - " + carro.getMarca() + " - " + carro.getModelo() + " - R$" + carro.getValor());
        }
    }

    public static Carro buscaCarro(int opcao) {
         if(!CarroRepository.listar().contains(CarroRepository.buscarCarroPorId(opcao))) {
            throw  new RuntimeException("Carro não encontrado");
        }
        return CarroRepository.buscarCarroPorId(opcao);    
    
    }

    public static void cadastrarCarro(String modelo, String marca, String placa, Double valor) {
        Carro carro = new Carro(Contador.next(), modelo, marca, valor, placa);

        CarroRepository.adicionar(carro);

        System.out.println("Carro Cadastrado com sucesso!");
    }

    public static void buscarCarrosAlugados() {
        List<Carro> carrosAlugados = CarroRepository.listar().stream().filter(carro -> carro.getStatus()
                .equals("ALUGADO")).collect(Collectors.toList());
        
        carrosAlugados.forEach(carro -> {
            System.out.println(carro.getMarca() + " - " + carro.getModelo() + " - " +carro.getPlaca());
        });
    }
    
}
