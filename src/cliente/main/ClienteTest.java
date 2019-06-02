package cliente.main;

import cliente.model.Cliente;

public class ClienteTest {


	public static void main(String[] args) {
		
	}
	//menu relacioonado ao cliente
	public static void menu() {

		System.out.println("----- Iniciando sistema -----");
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Cadastrar(1) |  Listar(2) | Sair(3)");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Digite uma das opções acima: ");
	}


	/*
	 * simulando dados de um formularios
	 */

	public static Cliente gerarFormMularioClienteMockado1(Cliente cliente) {

		cliente.setId(1);
		cliente.setNome("Edmar soares de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");
				
		return cliente;
	}

	public static Cliente gerarFormMularioClienteMockado2(Cliente cliente) {

		cliente.setId(2);
		cliente.setNome("jose de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");
				
		return cliente;
	}

	public static Cliente gerarFormMularioClienteMockado3(Cliente cliente) {

		System.out.println("Digite o primeiro cliente");
		System.out.println();

		cliente.setId(3);
		cliente.setNome("Maria de lima");
		cliente.setTelefone("83 898988989");
		cliente.setContrato("11231345644");
		
		return cliente;
	}
}
