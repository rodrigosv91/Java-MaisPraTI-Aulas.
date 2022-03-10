
package principal.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import principal.enuns.StatusCarro;
import principal.model.Aluguel;
import principal.model.Carro;
import principal.model.Cliente;
import principal.model.Vendedor;
import principal.model.repository.AluguelRepository;
import principal.model.repository.CarroRepository;
import principal.model.repository.VendedorRepository;
import principal.utils.Contador;


public class AluguelService {

    public static void novoAluguel(Cliente cliente, Vendedor vendedor, Carro carro, int qtDias) {
        Aluguel aluguel = new Aluguel(Contador.next(), carro, vendedor, cliente, qtDias, LocalDate.now());
        AluguelRepository.adicionar(aluguel);
        vendedor.addVenda();
        carro.setStatus(StatusCarro.ALUGADO);
        CarroRepository.atualizar(carro);
        VendedorRepository.atualizar(vendedor);
        aluguel.recibo();
    }
    
}
