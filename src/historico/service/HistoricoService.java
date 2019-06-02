package historico.service;

import historico.model.*;
import servicoGenerico.*;

public interface HistoricoService extends ServicoGenerico<Historico, Integer> {
	
	void realizaAtendimento();
	
}
