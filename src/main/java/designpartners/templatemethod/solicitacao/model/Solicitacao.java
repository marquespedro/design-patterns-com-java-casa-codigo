package designpartners.templatemethod.solicitacao.model;

public class Solicitacao {

	private Integer id;
	private TipoSolicitacao tipo;
	private String situacao;

	public Solicitacao(Integer id, TipoSolicitacao tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTipo(TipoSolicitacao tipo) {
		this.tipo = tipo;
	}

	public TipoSolicitacao getTipo() {
		return tipo;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Solicitacao [id=" + id + ", tipo=" + tipo + ", situacao=" + situacao + "]";
	}

}
