
package principal.service;

import principal.model.Cliente;
import principal.model.repository.ClienteRepository;
import principal.utils.Contador;


public class ClienteService {

    public static Cliente novoCliente(String nome, String cpf, String endereco) {
        Cliente cliente = new Cliente(Contador.next(), nome, cpf, endereco);
        ClienteRepository.adicionar(cliente);
        return cliente;
    }

    public static Cliente buscarPorCpf(long cpf) {
        return ClienteRepository.listar().stream().filter(cliente -> cliente.getCpf().equals(String.valueOf(cpf))).findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado!"));
        
 
    }
    
}
