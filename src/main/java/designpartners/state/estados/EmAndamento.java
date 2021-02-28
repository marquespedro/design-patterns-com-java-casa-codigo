package designpartners.state.estados;

import designpartners.state.model.SolicitacaoModel;

/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class EmAndamento extends State {

	@Override
	public State emAndamento() {
		
		SolicitacaoModel sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
				
		return this;
	}
	
	@Override
	public String toString() {
		return "Em Andamento";
	}
	
}
