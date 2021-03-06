package designpartners.state.estados;

import designpartners.state.model.SolicitacaoModel;

/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class Deferido extends State {

	@Override
	public State deferido() {
		
		SolicitacaoModel sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
		
		return this;
	}
	
	@Override
	public String toString() {
		return "Deferido";
	}
}
