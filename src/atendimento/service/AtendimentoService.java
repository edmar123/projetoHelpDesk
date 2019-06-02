package atendimento.service;

import atendimento.model.Atendimento;
import servicoGenerico.ServicoGenerico;

public interface AtendimentoService extends ServicoGenerico<Atendimento, Integer> {
	
	void relizaChamada();	

}
