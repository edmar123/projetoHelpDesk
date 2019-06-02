package cliente.service;

import cliente.model.Cliente;
import servicoGenerico.ServicoGenerico;

public interface ClienteService extends ServicoGenerico<Cliente, Integer> {
	
	void relizaChamada();	

}
