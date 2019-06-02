package cliente.main;

import java.util.Scanner;

import cliente.model.Cliente;
import cliente.service.ClienteService;
import cliente.service.ClienteServiceImpl;

public class TestCliente {

	public static void main(String[] args) {
		
		System.out.println("----- Iniciando sistema -----");
		System.out.println();
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		String operacao = scanner.nextLine();
		
		ClienteService servicoCliente = new ClienteServiceImpl();

		/**
		 * Recebendo dados do cliente para salvar
		 */
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();

		Cliente dadosCliente1 = gerarFormMularioClienteMockado1(cliente1);
		Cliente dadosCliente2 = gerarFormMularioClienteMockado2(cliente2);
		Cliente dadosCliente3 = gerarFormMularioClienteMockado2(cliente3);
		Cliente dadosCliente4 = gerarFormMularioClienteMockado2(cliente4);

		servicoCliente.salvar(dadosCliente1);
		servicoCliente.salvar(dadosCliente2);
		servicoCliente.salvar(dadosCliente3);
		servicoCliente.salvar(dadosCliente4);

		servicoCliente.listar();

		System.out.println();

		servicoCliente.remover(dadosCliente1);

		System.out.println();
		servicoCliente.listar();

	}

	/*
	 * simulando dados de um formularios
	 */

	private static Cliente gerarFormMularioClienteMockado1(Cliente cliente) {

		cliente.setId(1);
		cliente.setNome("Edmar soares de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");

		return cliente;
	}

	private static Cliente gerarFormMularioClienteMockado2(Cliente cliente) {

		cliente.setId(2);
		cliente.setNome("jose de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");

		return cliente;
	}

	private static Cliente gerarFormMularioClienteMockado3(Cliente cliente) {

		System.out.println("Digite o primeiro cliente");
		System.out.println();

		cliente.setId(3);
		cliente.setNome("Maria de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");

		return cliente;
	}

	private static Cliente gerarFormMularioClienteMockado4(Cliente cliente) {

		cliente.setId(4);
		cliente.setNome("Antonio de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");

		return cliente;
	}

}
