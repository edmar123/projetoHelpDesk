package servicoGenerico;

import java.util.List;

public interface ServicoGenerico<T, G> {
		
	List<T> listar();
	void salvar(T entidade);
	void remover(T entidade);
	void fazerAniversario();
}
