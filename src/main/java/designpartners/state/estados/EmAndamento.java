package designpartners.state.estados;

import model.Solicitacao;

/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class EmAndamento extends State {

	@Override
	public State emAndamento() {
		
		Solicitacao sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
				
		return this;
	}
	
	@Override
	public String toString() {
		return "Em Andamento";
	}
	
}
