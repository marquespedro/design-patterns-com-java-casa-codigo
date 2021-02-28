package designpartners.state.estados;

import designpartners.state.model.SolicitacaoModel;

/**
 * @author Machine
 * 
 * Representa uma abstracao do estado
 * 
 * O padrao state evita a quantidade de if no codigo, melhorar a legibilidade e manutencao do mesmo.
 * Torna mais facil a inclusao de um novo estado.
 * Cada estado é responsável por lidar com sua logica.
 */
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
