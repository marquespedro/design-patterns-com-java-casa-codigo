package designpartners.state.estados;

import designpartners.state.model.SolicitacaoModel;

public abstract class State {

	private SolicitacaoModel solicitacao;
	
	public State emAndamento() {
		return null;
	}
	
	public State pendenteAssinatura() {
		return null;
	}
	
	public State pendenteEnvio() {
		return null;
	}
	
	public State analiseSecretataria() {
		return null;
	}
	
	public State deferido() {
		return null;
	}
	
	public State indeferido() {
		return null;
	}
	
	public State informacaoComplementar() {
		return null;
	}

	public void setSolicitacao(SolicitacaoModel solicitacao) {
		this.solicitacao = solicitacao;
	}

	public SolicitacaoModel getSolicitacao() {
		return solicitacao;
	}
	
	
}
