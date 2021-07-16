package designpartners.state.estados;

import java.util.Arrays;

import model.Solicitacao;


/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class PendenteAssinatura extends State {

	@Override
	public State pendenteAssinatura() {
		
		Solicitacao sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
		
		sm.adicionarDocumentos(Arrays.asList("DOC-1" , "DOC-2"));
				
		return this;
	}
	
	@Override
	public String toString() {
		return "Pendente Assinatura";
	}
	
}
