package tecnico.service;

import servicoGenerico.ServicoGenerico;
import tecnico.model.Tecnico;

public interface TecnicoServiceImpl  extends ServicoGenerico<Tecnico, Long>{
	
	void atendeOrdemServico();
}
