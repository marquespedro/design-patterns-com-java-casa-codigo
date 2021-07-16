package designpartners.state.estados;

import model.Solicitacao;

/**
 * @author Machine
 * 
 * Representa uma abstracao do estado
 * 
 * O padrao state evita a quantidade de if no codigo, melhorar a legibilidade e manutencao do mesmo.
 * Torna mais facil a inclusao de um novo estado.
 * Cada estado � respons�vel por lidar com sua logica.
 */
public abstract class State {

	private Solicitacao solicitacao;
	
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

	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public Solicitacao getSolicitacao() {
		return solicitacao;
	}
	
	
}
