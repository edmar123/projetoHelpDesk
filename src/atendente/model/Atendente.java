package atendente.model;

import java.time.LocalDateTime;

import model.Pessoa;

public class Atendente extends Pessoa{
		
	private String codigo;
	
	private LocalDateTime prazoAtendimento;		

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getPrazoAtendimento() {
		return prazoAtendimento;
	}

	public void setPrazoAtendimento(LocalDateTime prazoAtendimento) {
		this.prazoAtendimento = prazoAtendimento;
	}



}
