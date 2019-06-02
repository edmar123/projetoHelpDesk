package atendimento.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atendimento.model.Atendimento;
import servicoGenerico.ServicoGenerico;

public class AtendimentoServiceImpl implements ServicoGenerico<Atendimento, Integer> {

	List<Atendimento> atendimentos = new ArrayList<>();

	@Override
	public List<Atendimento> listar() {
		System.out.println("-----Atendimentos cadastrados-----");

		System.out.println();

		for (int i = 0; i < atendimentos.size(); i++) {
			System.out.println(atendimentos.get(i).getSolicitacao());
		}
		
		return this.atendimentos;
	}

	@Override
	public void salvar(Atendimento atendimento) {

		System.out.println("------ Registrando um atendimento  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Cadastrar este atendente ?");
		System.out.println();

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
	public void remover(Atendimento atendente) {

		System.out.println("------ Remover Atendente  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Remover este cliente ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {

			atendimentos.remove(atendente);

			System.out.println("----- Atendente removido com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando a remocão de Atendente -----");
			System.out.println();
		}

		System.out.println("Removendo Atendente da base de dados");
	}

	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub

	}
}
