package atendente.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atendente.model.Atendente;
import cliente.model.Cliente;

public class AtendimentoServiceImpl implements AtendenteService {

	List<Atendente> atendentes = new ArrayList<>();

	@Override
	public void listar() {
		System.out.println("-----Atendentes cadastrados-----");

		System.out.println();

		for (int i = 0; i < atendentes.size(); i++) {
			System.out.println(atendentes.get(i).getNome());
		}
	}

	@Override
	public void salvar(Atendente atendente) {

		System.out.println("------ Cadastro de  Cliente  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Cadastrar este atendente ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {
			Atendente atendenteSalvo = atendente;

			atendentes.add(atendenteSalvo);
			System.out.println("----- Atendente cadastrado com Sucesso -----");
			System.out.println();

		} else if (acao.equals("cancelar")) {
			System.out.println("----- Cancelando o Cadastro de Atendente -----");
			System.out.println();
		}
	}

	@Override
	public void remover(Atendente atendente) {

		System.out.println("------ Remover Atendente  ------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Deseja Remover este cliente ?");
		System.out.println();

		String acao = scanner.nextLine();

		System.out.println();

		if (acao.equals("sim")) {

			atendentes.remove(atendente);

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

	@Override
	public void relizaChamada() {
		System.out.println("Realizando chamado...");
	}

}
