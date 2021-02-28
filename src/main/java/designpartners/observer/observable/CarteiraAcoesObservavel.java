package designpartners.observer.observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import designpartners.observer.observers.carteiracoes.Observador;

/**
 * @author Machine
 * 
 * Classe que esta sendo observada, portanto carrega a lista de observadores.
 * Quando ocorre qualquer alterar o metodo notificar pecorre a lista de observadores atualizando suas quantidades.
 */
public class CarteiraAcoesObservavel extends Observable{

	private Map<String, Integer> acoes = new HashMap<>();
	
	private List<Observador> observers = new ArrayList<>();
	
	public void adicionaAcoes(String acao, Integer qtd) {
		
		if(acoes.containsKey(acao)) {
			qtd += acoes.get(acao);
		}
		
		acoes.put(acao, qtd);
		notificar(acao, qtd);
	}

	
	public void addObservador(Observador o) {
		observers.add(o);
	}
	
	private void notificar(String acao, Integer qtd) {
		
		for(Observador ob : observers) {
			ob.mudancaQuantidade(acao, qtd);
		}
		
	}
}
