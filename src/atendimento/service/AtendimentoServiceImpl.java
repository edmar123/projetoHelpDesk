package atendimento.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atendimento.model.Atendimento;
import servicoGenerico.ServicoGenerico;

public class AtendimentoServiceImpl implements ServicoGenerico<Atendimento, Integer> {

	private List<Atendimento> atendimentos = new ArrayList<>();

	@Override
	public List<Atendimento> listar() {
		System.out.println("-----Atendimentos cadastrados-----");

		System.out.println();

		for (int i = 0; i < atendimentos.size(); i++) {
			System.out.println(atendimentos.get(i).toString());
		}
		
		return this.atendimentos;
	}

	@Override
	public void salvar(Atendimento atendimento) {

		System.out.println("------ Registrando um atendimento  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Cadastrar este atendimento ?");
		System.out.println();
		System.out.println("Dados do atendimento: " + atendimento.toString());

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {
			Atendimento atendimentosalvo = atendimento;

			atendimentos.add(atendimentosalvo);
			System.out.println("----- Atendimento registrado com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando o registro de atendimento -----");
			System.out.println();
		}
	}

	@Override
	public void remover(Atendimento atendimento) {

		System.out.println("------ Remover Atendimento ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Remover este Atendimento ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {

			atendimentos.remove(atendimento);

			System.out.println("----- Atendimento removido com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando a remocão de Atendimento -----");
			System.out.println();
		}

		System.out.println("Removendo Atendimento da base de dados");
	}

	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub

	}
}
