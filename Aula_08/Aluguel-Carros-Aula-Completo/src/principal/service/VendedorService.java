package principal.service;

import java.util.List;
import java.util.stream.Collectors;
import principal.model.Vendedor;
import principal.model.repository.VendedorRepository;
import principal.utils.Contador;

public class VendedorService {

    public static void mostrarVendedores() {
        for (Vendedor vendedor : VendedorRepository.listar()) {
            System.out.println(vendedor.getId() + " - " + vendedor.getNome());
        }
    }

    public static Vendedor buscaVendedor(int opcao) {
        if (!VendedorRepository.listar().contains(VendedorRepository.buscarVendedorPorId(opcao))) {
            throw new RuntimeException("Vendedor não encontrado");
        }
        return VendedorRepository.buscarVendedorPorId(opcao);

    }

    public static void cadastrarVendedor(String nome, String cpf, String endereco) {
        Vendedor vendedor = new Vendedor(Contador.next(), nome, cpf, endereco);

        VendedorRepository.adicionar(vendedor);

        System.out.println("Vendedor cadastrado com sucesso!");
    }

}
