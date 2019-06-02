package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atendente.main.AtendenteTest;
import atendente.model.Atendente;
import atendente.service.AtendenteService;
import atendente.service.AtendenteServiceImpl;
import cliente.main.ClienteTest;
import cliente.model.Cliente;
import cliente.service.ClienteService;
import cliente.service.ClienteServiceImpl;

public class testPrincipal {

	static List<Cliente> clientesCadastrados = new ArrayList<>();

	static ClienteService servicoCliente = new ClienteServiceImpl();
	
	static List<Atendente>  atendentesCadastrados = new ArrayList<>();

	static AtendenteService servicoAtendente = new AtendenteServiceImpl();

	public static void main(String[] args) {

		String permissao;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a sua permissao ??");
		System.out.println("Atendente(1) | cliente(2)");

		permissao = scanner.nextLine();

		switch (permissao) {

		case "1":
			permissaoAtendente();
			break;
		case "2":
			permissaoCliente();
			break;

		default:
			System.out.println("Opção inválida");
		}
	}
	
	public static void permissaoAtendente() {
		String operacao;
		Scanner scanner = new Scanner(System.in);

		do {
			AtendenteTest.menu();
			operacao = scanner.nextLine();

			switch (operacao) {
			case "1":
				gerandoAtendente();
				break;
			case "2":
				listarAtendentes();
				break;
			case "3":
//				listarCliente();
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (operacao != "sair");
	}

	public static void permissaoCliente() {
		String operacao;
		Scanner scanner = new Scanner(System.in);

		do {
			ClienteTest.menu();
			operacao = scanner.nextLine();

			switch (operacao) {
			case "1":
				gerandoCliente();
				break;
			case "2":
				listarCliente();
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (operacao != "sair");
	}

	public static void gerandoCliente() {
		/**
		 * Recebendo dados do cliente para salvar
		 */
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		Cliente dadosCliente1 = ClienteTest.gerarFormMularioClienteMockado1(cliente1);
		Cliente dadosCliente2 = ClienteTest.gerarFormMularioClienteMockado2(cliente2);

		servicoCliente.salvar(dadosCliente1);
		servicoCliente.salvar(dadosCliente2);

	}
	
	public static void gerandoAtendente() {
		/**
		 * Recebendo dados do cliente para salvar
		 */
		Atendente atendente1= new Atendente();
		Atendente atendente2 = new Atendente();

		Atendente dadosCliente1 = AtendenteTest.gerarFormMularioAtendenteMockado1(atendente1);
		Atendente dadosCliente2 = AtendenteTest.gerarFormMularioAtendenteMockado2(atendente2);

		servicoAtendente.salvar(dadosCliente1);
		servicoAtendente.salvar(dadosCliente2);

	}

	public static void listarCliente() {
		clientesCadastrados = servicoCliente.listar();
	}
	
	public static void listarAtendentes() {
		atendentesCadastrados = servicoAtendente.listar();
	}

}
