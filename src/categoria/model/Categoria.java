package categoria.model;

import categoria.TipoServico;

public class Categoria {
	
	private Long id;
	
	private TipoServico tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoServico getTipo() {
		return tipo;
	}
	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}
	
}
