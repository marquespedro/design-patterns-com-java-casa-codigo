package designpartners.state.estados;

import java.util.List;
import java.util.stream.Collectors;

import designpartners.state.model.SolicitacaoModel;


/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class AnaliseSecretaria extends State {

	@Override
	public State analiseSecretataria() {
		
		SolicitacaoModel sm = getSolicitacao();
		
		sm.setEstadoAtual(this);
		
		sm.adicionarEstado(this);
		
		transmitirDocumentos();
		
		return this;
	}
	
	private void transmitirDocumentos() {
		
		SolicitacaoModel sm = getSolicitacao();
		
		List<String> documentos = sm.getDocumentos().stream()
									.map(d -> d + " - TRANSMITIDO")
									.collect(Collectors.toList());
		sm.getDocumentos().clear();
		
		sm.getDocumentos().addAll(documentos);
	}

	@Override
	public String toString() {
		return "Analise Secretaria";
	}
	
}
