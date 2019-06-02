package historico.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import historico.model.Historico;

public class HistoricoServiceImpl implements HistoricoService {
	
	List<Historico> historicos = new ArrayList<>();
	
	@Override
	public void listar() {
		System.out.println("------------- Histórico --------------");
		
		for (int i = 0; i < historicos.size(); i++) {
			System.out.println(historicos.get(i).getDescricao());
			System.out.println(historicos.get(i).getDataRegistro());
		}
		
	}

	@Override
	public void salvar(Historico historico) {
		
		String option = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------- Inserção de Histórico -----------\n");
		System.out.println("Deseja anexar o histórico informado?");
		
		option = scan.nextLine();
		
		if (option.equals("sim")) {
			Historico historicoSalvo = historico;
			
			historicos.add(historico);
			System.out.println("---------- Histórico anexado com sucesso! ----------");
		} else if (option.equals("nao")) {
			System.out.println("---------- Anexo de histórico cancelado! ----------");
		}
		
	}

	@Override
	public void remover(Historico historico) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------- Remover Histórico ---------");
		System.out.println("Deseja remover o histórico? \n");
		
		String option = scan.nextLine();
		
		if (option.equals("sim")) {
			
			historicos.remove(historico);
			System.out.println("-------- Histórico removido com sucesso! --------\n");

		} else if (option.equals("nao")) {
			System.out.println("--------- Cancelado! ----------");
		}
		
	}

	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizaAtendimento() {
		System.out.println("----------- Realizando Atendimento... -----------");
		
	}
	
	
	
}
