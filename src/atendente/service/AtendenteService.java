package atendente.service;

import atendente.model.Atendente;
import servicoGenerico.ServicoGenerico;

public interface AtendenteService extends ServicoGenerico<Atendente, Integer> {
	
	void relizaChamada();	

}
