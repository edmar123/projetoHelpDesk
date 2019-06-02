package categoria;

public enum TipoServico {
	HARDWARE("hardaware"),
	SOFTWARE("software");
	
	private String descricao;
	
	TipoServico(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
