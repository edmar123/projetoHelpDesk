package cliente.service;

import cliente.Cliente;
import servicoGenerico.ServicoGenerico;

public interface ClienteService extends ServicoGenerico<Cliente, Integer> {
	
	void relizaChamada();	

}
