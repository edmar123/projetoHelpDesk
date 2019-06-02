package utils;

public enum TipoOperacao {
	
	CADASTRAR("cadastrar"),
	REMOVER("remover"),
	LISTAR("listar");
	
	private String descricao;
	
	TipoOperacao(String descricao){
		this.descricao = descricao;
	}

}
