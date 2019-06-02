package atendimento.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atendimento.model.Atendimento;
import atendimento.service.AtendimentoServiceImpl;
import servicoGenerico.ServicoGenerico;

public class AtendimentoTest {

	static List<Atendimento> atendimentosCadastrados = new ArrayList<>();

	static ServicoGenerico<Atendimento, Integer> servicoAtendimento = new AtendimentoServiceImpl();

	public static void main(String[] args) {

	}

	public static void permissaoFuncionario() {
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

	public static void menu() {

		System.out.println("----- Iniciando sistema -----");
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Cadastrar(1) |  Listar(2) | Remover(3)");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("Digite uma das opções acima: ");
	}

	public static void salvar() {
		/**
		 * Recebendo dados do cliente para salvar
		 */
		Atendimento atendimento = new Atendimento();
	

		Atendimento atendimentoSalvo = gerarFormMularioClienteMockado1(atendimento);
	

		servicoAtendimento.salvar(atendimentoSalvo);
	}

	public static void listar() {
//		atendimentosCadastrados = servicoCliente.listar();
	}

	/*
	 * simulando dados de um formularios
	 */

	private static Atendimento gerarFormMularioClienteMockado1(Atendimento  atendimento) {

		atendimento.setId(1);

		atendimentosCadastrados.add(atendimento);

		return atendimento;
	}

}
