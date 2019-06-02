package servicoGenerico;

public interface ServicoGenerico<T, G> {
		
	void listar();
	void salvar(T entidade);
	void remover(T entidade);
	void fazerAniversario();
}
