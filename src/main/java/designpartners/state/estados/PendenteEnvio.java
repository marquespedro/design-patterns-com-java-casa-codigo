package designpartners.state.estados;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import model.Solicitacao;


/**
 * @author Machine
 *
 * Representa um estado concreto
 */
public class PendenteEnvio extends State{

	@Override
	public State pendenteEnvio() {
		
		Solicitacao sm = getSolicitacao();
		
		sm.setEstadoAtual(this);	
		sm.adicionarEstado(this);
		
		assinarDocumentos(sm.getDocumentos());
		
		return this;
	}

	@Override
	public String toString() {
		return "Pendente Envio";
	}
	
	private void assinarDocumentos(List<String> documentos) {
		
		if(Objects.isNull(documentos) || documentos.isEmpty()) {
			return;
		}		
		
		List<String> assinados = documentos.stream()
										   .map(d -> d + " - ASSINADO")
										   .collect(Collectors.toList());
		
		getSolicitacao().getDocumentos().clear();
		getSolicitacao().adicionarDocumentos(assinados);
	}
}
