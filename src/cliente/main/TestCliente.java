package cliente.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SwingUtilities;

import cliente.model.Cliente;
import cliente.service.ClienteService;
import cliente.service.ClienteServiceImpl;

public class TestCliente {

	static List<Cliente>  clientesCadastrados = new ArrayList<>();
	
	static ClienteService servicoCliente = new ClienteServiceImpl();


	public static void main(String[] args) {
		String operacao;
		Scanner scanner = new Scanner(System.in);

		do {
			menu();
			operacao = scanner.nextLine();

			switch (operacao) {
			case "1":
				salvar();
				break;
			case "2":
				listar();
				break;

			default:
				System.out.println("Opção inválida.");
			}
		} while (operacao != "0");

	}

	private static void menu() {

		System.out.println("----- Iniciando sistema -----");
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Cadastrar(1) |  Listar(2) | Remover(3)");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Digite uma das opções acima: ");
	}

	private static void salvar() {
		/**
		 * Recebendo dados do cliente para salvar
		 */
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();

		Cliente dadosCliente1 = gerarFormMularioClienteMockado1(cliente1);
		Cliente dadosCliente2 = gerarFormMularioClienteMockado2(cliente2);
		Cliente dadosCliente3 = gerarFormMularioClienteMockado2(cliente3);

		servicoCliente.salvar(dadosCliente1);
		servicoCliente.salvar(dadosCliente2);
		servicoCliente.salvar(dadosCliente3);
	
	}

	public static void listar() {
		clientesCadastrados = servicoCliente.listar();
	}

	/*
	 * simulando dados de um formularios
	 */

	private static Cliente gerarFormMularioClienteMockado1(Cliente cliente) {

		cliente.setId(1);
		cliente.setNome("Edmar soares de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");
		
		clientesCadastrados.add(cliente);
		
		return cliente;
	}

	private static Cliente gerarFormMularioClienteMockado2(Cliente cliente) {

		cliente.setId(2);
		cliente.setNome("jose de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");
		
		clientesCadastrados.add(cliente);
		
		return cliente;
	}

	private static Cliente gerarFormMularioClienteMockado3(Cliente cliente) {

		System.out.println("Digite o primeiro cliente");
		System.out.println();

		cliente.setId(3);
		cliente.setNome("Maria de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");
		
		clientesCadastrados.add(cliente);

		return cliente;
	}



}
