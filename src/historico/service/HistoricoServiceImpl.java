package historico.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import historico.model.Historico;
import servicoGenerico.ServicoGenerico;

public class HistoricoServiceImpl implements ServicoGenerico<Historico, Integer> {
	
	List<Historico> historicos = new ArrayList<>();
	
	@Override
	public List<Historico> listar() {
		System.out.println("------------- Hist�rico --------------");
		
		for (int i = 0; i < historicos.size(); i++) {
			System.out.println(historicos.get(i).getDescricao());
			System.out.println(historicos.get(i).getDataRegistro());
		}
		
		return this.historicos;
		
	}

	@Override
	public void salvar(Historico historico) {
		
		String option = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---------- Inser��o de Hist�rico -----------\n");
		System.out.println("Deseja anexar o hist�rico informado?");
		
		option = scan.nextLine();
		
		if (option.equals("sim")) {
			Historico historicoSalvo = historico;
			
			historicos.add(historico);
			System.out.println("---------- Hist�rico anexado com sucesso! ----------");
		} else if (option.equals("nao")) {
			System.out.println("---------- Anexo de hist�rico cancelado! ----------");
		}
		
	}

	@Override
	public void remover(Historico historico) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------- Remover Hist�rico ---------");
		System.out.println("Deseja remover o hist�rico? \n");
		
		String option = scan.nextLine();
		
		if (option.equals("sim")) {
			
			historicos.remove(historico);
			System.out.println("-------- Hist�rico removido com sucesso! --------\n");

		} else if (option.equals("nao")) {
			System.out.println("--------- Cancelado! ----------");
		}
		
	}

	@Override
	public void fazerAniversario() {
		// TODO Auto-generated method stub
		
	}
}
