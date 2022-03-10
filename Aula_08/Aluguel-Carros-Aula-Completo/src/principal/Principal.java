package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import principal.enuns.StatusCarro;
import principal.model.Aluguel;
import principal.model.Carro;
import principal.model.Cliente;
import principal.model.Vendedor;
import principal.model.repository.CarroRepository;
import principal.model.repository.VendedorRepository;
import principal.utils.Contador;
import principal.utils.Menu;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        CarroRepository.adicionar(new Carro(Contador.next(), "Corsa", "Ford", 100, "lps300"));
        CarroRepository.adicionar(new Carro(Contador.next(), "Versa", "Nissan", 200, "lps500"));
        VendedorRepository.adicionar(new Vendedor(Contador.next(), "Cristiano Ronaldo", "87445363834", "Cristovao"));
        VendedorRepository.adicionar(new Vendedor(Contador.next(), "Lionel Messi", "87443434834", "Cristovao"));

        int opcao = 0;
        do {
            Menu.limparTela();
            Menu.menuPrincipal();
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                Menu.opcaoMenu(opcao);
            } else {
                System.out.println("Opção inválida. Vamos começar novamente! ");
                Thread.sleep(2000);
            }
            sc.nextLine();

            Thread.sleep(2400);
        } while (opcao != 0);
    }
}
