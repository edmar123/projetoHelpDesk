package ordemService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atendente.model.Atendente;
import atendimento.model.Atendimento;
import ordemService.model.OrdemServico;
import servicoGenerico.ServicoGenerico;

public class OrdemServicoServiceImpl implements ServicoGenerico<OrdemServico, Integer> {

	List<OrdemServico> ordensServicos = new ArrayList<>();

	@Override
	public List<OrdemServico> listar() {
		System.out.println("-----Atendimentos cadastrados-----");

		System.out.println();

		for (int i = 0; i < ordensServicos.size(); i++) {
			System.out.println(ordensServicos.get(i).getProtocolo());
		}
		return this.ordensServicos;
	}

	@Override
	public void salvar(OrdemServico ordemServico) {

		System.out.println("------ Registrando uma Ordem de service ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Cadastrar este Ordem de service ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {
			OrdemServico ordemServicoSalvo = ordemServico;

			this.ordensServicos.add(ordemServicoSalvo);
			System.out.println("----- Ordem de service registrado com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando o registro de Ordem de service -----");
			System.out.println();
		}
	}

	@Override
	public void remover(OrdemServico ordemServico) {

		System.out.println("------ Remover Ordem de Servico  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Remover esta Ordem de Servico ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {

			this.ordensServicos.remove(ordemServico);

			System.out.println("----- Ordem de Servico removido com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando a remocão de Ordem de Servico -----");
			System.out.println();
		}

		System.out.println("Removendo Ordem de Servico da base de dados");
	}

	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub

	}
}
