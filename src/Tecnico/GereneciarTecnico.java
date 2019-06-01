package Tecnico;

import servicoGenerico.ServicoGenerico;

public interface GereneciarTecnico  extends ServicoGenerico<Tecnico, Long>{
	
	void atendeOrdemServico();
}
