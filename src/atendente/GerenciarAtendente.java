package atendente;

import servicoGenerico.ServicoGenerico;

public interface GerenciarAtendente extends ServicoGenerico<Atendente, Long> {
	
	void atendeChamada();

}
