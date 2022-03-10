package principal.utils;

import java.util.Scanner;
import principal.model.Carro;
import principal.model.Cliente;
import principal.model.Vendedor;
import principal.service.AluguelService;
import principal.service.CarroService;
import principal.service.ClienteService;
import principal.service.VendedorService;

public class Menu {

    public static void menuPrincipal() {
        System.out.println("BEM VINDOS AO SISTEMAS DE ALUGUEL");
        System.out.println("1 - Alugar um carro");
        System.out.println("2 - Administração");
        System.out.println("0 - Para sair");
    }

    public static void limparTela() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static int validaScanner(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public static long validaSeClienteCadastrado(Scanner sc) {
        while (!sc.hasNextLong()) {
            System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
            sc.nextLine();
        }
        return sc.nextLong();
    }

    public static void opcaoMenu(int opcao) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        switch (opcao) {
            case 1:
                alugarCarro(sc);
                break;
            case 2:
                administracao(sc);
                break;
            default:
                System.out.println("opção inválida");
        }
    }

    private static void alugarCarro(Scanner sc) throws InterruptedException {
        int opcao = 0;
        long opcaoCliente = 0;
        Cliente cliente = null;
        Carro carro = null;
        Vendedor vendedor = null;
        limparTela();

        //CADASTRO DE CLIENTE
        do {
            System.out.println("Boa noite, cliente. Você já tem cadastro?. Se sim, digite seu cpf, caso não tenha. Digite 1 ");
            opcaoCliente = validaSeClienteCadastrado(sc);
            if (opcaoCliente == 1) {
                limparTela();
                sc.nextLine();
                System.out.println("Digite seu nome completo: ");
                String nome = sc.nextLine();
                System.out.println("Digite seu cpf: ");
                String cpf = sc.nextLine();
                System.out.println("Digite seu endereço: ");
                String endereco = sc.nextLine();
                cliente = ClienteService.novoCliente(nome, cpf, endereco);
                System.out.println("Cadastrado com sucesso");
                Thread.sleep(2000);
            } else {
                try {
                    cliente = ClienteService.buscarPorCpf(opcaoCliente);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    opcaoCliente = 1;
                }
            }
        } while (opcaoCliente == 1);

        //ESCOLHA DO CARRO        
        do {
            try {
                limparTela();
                System.out.println(cliente.getNome() + ", ESCOLHA UMA OPCAO:");
                CarroService.mostrarCarros();
                opcao = validaScanner(sc);
                carro = CarroService.buscaCarro(opcao);
                opcao = 0;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        } while (opcao != 0);

        //ESCOLHA DO VENDEDOR
        do {
            try {
                limparTela();
                System.out.println("Quem atendeu você?");
                VendedorService.mostrarVendedores();
                opcao = validaScanner(sc);
                vendedor = VendedorService.buscaVendedor(opcao);
                opcao = 0;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        } while (opcao != 0);

        System.out.println("Quantos dias você alugará o carro?");
        int qtDias = validaScanner(sc);

        AluguelService.novoAluguel(cliente, vendedor, carro, qtDias);
    }

    private static void administracao(Scanner sc) throws InterruptedException {
        String senha = null;
        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals("senha123"));

        System.out.println("1 - Cadastrar um carro");
        System.out.println("2 - Cadastrar um vendedor");
        System.out.println("3 - Ver carros alugados");
        System.out.println("4 - Ver total de vendas de um vendedor");

        int opcao = validaScanner(sc);

        switch (opcao) {
            case 1:
                limparTela();
                sc.nextLine();
                System.out.println("Qual o modelo do carro?");
                String modelo = sc.nextLine();
                System.out.println("Qual a marca do carro?");
                String marca = sc.nextLine();
                System.out.println("Qual a placa do carro?");
                String placa = sc.nextLine();
                System.out.println("Qual o valor diário do carro?");
                while (!sc.hasNextDouble()) {
                    System.out.println("Valor inválido. Tente novamente");
                    sc.nextLine();
                }
                Double valor = sc.nextDouble();

                CarroService.cadastrarCarro(modelo, marca, placa, valor);
                Thread.sleep(2000);
                break;
            case 2:
                limparTela();
                sc.nextLine();
                System.out.println("Qual o nome do vendedor: ");
                String nome = sc.nextLine();
                System.out.println("Qual o cpf do vendedor: ");
                String cpf = sc.nextLine();
                System.out.println("Qual o endereco do vendedor?");
                String endereco = sc.nextLine();

                VendedorService.cadastrarVendedor(nome, cpf, endereco);

                Thread.sleep(2000);
                break;
            case 3:
                CarroService.buscarCarrosAlugados();
                break;
            case 4:
                System.out.println("IMPLEMENTAR");
                break;
        }
    }
}
