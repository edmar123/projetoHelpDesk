package categoria.service;

import categoria.model.Categoria;
import servicoGenerico.ServicoGenerico;

public interface CategoriaService extends ServicoGenerico<Categoria, Long>{
	
	void alocaCategoria();
	
}
