package Categoria;

public enum TipoServico {
	HARDWARE(""),
	SOFTWARE("");
	
	private String descricao;
	
	TipoServico(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
