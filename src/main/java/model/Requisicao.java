package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import designpartners.state.estados.State;

/**
 * @author Machine
 *
 * Representa uma entidade 
 */
public class Requisicao {

	private State estadoAtual = null;

	private List<State> estados = new ArrayList<>();
	
	private List<String> documentos = new ArrayList<>();

	public State getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(State estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public List<State> getEstados() {
		return estados;
	}

	public void setEstados(List<State> estados) {
		this.estados = estados;
	}
	
	public void adicionarEstado(State estado) {
		
		if(Objects.isNull(estado) ) {
			return;
		}
		
		estados.add(estado);		
	}
	
	
	public void adicionarDocumentos(List<String> docs) {
		
		if(Objects.isNull(docs) || docs.isEmpty()) {
			return;
		}
		
		documentos.addAll(docs);		
	}

	
	
	public List<String> getDocumentos() {
		return documentos;
	}

	@Override
	public String toString() {
		return "SolicitacaoModel [estadoAtual=" + estadoAtual + ", estados=" + estados + ", documentos=" + documentos + "]";
	}
	
	
}
