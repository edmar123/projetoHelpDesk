package servicoGenerico;

public interface ServicoGenerico<T, G> {
		
	void listar();
	void salvar(T entidade);
	void remover(G id);
	void fazerAniversario();
}
