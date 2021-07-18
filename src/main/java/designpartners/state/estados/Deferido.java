package designpartners.state.estados;

import model.Requisicao;

/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class Deferido extends State {

	@Override
	public State deferido() {
		
		Requisicao sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
		
		return this;
	}
	
	@Override
	public String toString() {
		return "Deferido";
	}
}
