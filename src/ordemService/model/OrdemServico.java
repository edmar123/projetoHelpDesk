package ordemService.model;

import tecnico.model.Tecnico;

public class OrdemServico {
	
	private Integer id;
	
	private String protocolo;
	
	private Tecnico tecnico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Override
	public String toString() {
		return "OrdemServico [id=" + id + ", protocolo=" + protocolo + ", tecnico=" + tecnico + "]";
	}
}
