package atendente.main;

import atendente.model.Atendente;

public class AtendenteTest {

	public static void menu() {

		System.out.println("----- Iniciando sistema -----");
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Cadastrar(1) |  Listar(2) | Remover(3) | Atendimento (4) | sair(5)");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Digite uma das opções acima: ");
	}

	/*
	 * simulando dados de um formularios
	 */

	public static Atendente gerarFormMularioAtendenteMockado1(Atendente atendente) {

		atendente.setId(1);
		atendente.setNome("Edmar soares de lima");
		atendente.setTelefone("83 898988989");
//		atendente.setPrazoAtendimento(LocalDateTime.);
				
		return atendente;
	}


	public static Atendente gerarFormMularioAtendenteMockado2(Atendente atendente) {

		atendente.setId(1);
		atendente.setNome("marcos antonio de lima");
		atendente.setTelefone("83 898988989");
//		atendente.setPrazoAtendimento(LocalDateTime.);
				
		return atendente;
	}


}
