package designpartners.state.estados;

import model.Requisicao;

/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class EmAndamento extends State {

	@Override
	public State emAndamento() {
		
		Requisicao sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
				
		return this;
	}
	
	@Override
	public String toString() {
		return "Em Andamento";
	}
	
}
