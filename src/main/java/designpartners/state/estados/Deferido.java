package designpartners.state.estados;

import model.Solicitacao;

/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class Deferido extends State {

	@Override
	public State deferido() {
		
		Solicitacao sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
		
		return this;
	}
	
	@Override
	public String toString() {
		return "Deferido";
	}
}
