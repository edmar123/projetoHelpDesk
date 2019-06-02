package categoria.service;

import categoria.model.SubCategoria;
import servicoGenerico.ServicoGenerico;

public interface SubCategoriaService extends ServicoGenerico<SubCategoria, Integer> {
	
	void alocaCategoria();
	
}
