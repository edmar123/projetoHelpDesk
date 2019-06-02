package cliente.model;

import model.Pessoa;

public class Cliente extends Pessoa {
	
	private String contrato;

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		
		return "Cliente [contrato = " + contrato + " | nome = " + super.getNome() +"]";
	}
	
	
}
