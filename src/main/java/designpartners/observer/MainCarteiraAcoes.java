package designpartners.observer;

import designpartners.observer.observable.CarteiraAcoesObservavel;
import designpartners.observer.observers.carteiracoes.AcoesLoggerObservador;
import designpartners.observer.observers.carteiracoes.GraficoBarrasListener;

public class MainCarteiraAcoes {

	public static void main(String[] args) throws InterruptedException {
		
		GraficoBarrasListener graficoBarrasObserver = new GraficoBarrasListener();
		
		AcoesLoggerObservador acoesLoggerObserver = new AcoesLoggerObservador();
		
		CarteiraAcoesObservavel carteira = new CarteiraAcoesObservavel();
		
		carteira.addObservador(graficoBarrasObserver);
		carteira.addObservador(acoesLoggerObserver);

		Thread.sleep(2000);

		carteira.adicionaAcoes("FLEURY3", 300);
		
		Thread.sleep(2000);
		
		carteira.adicionaAcoes("PETR3", 100);
		
		Thread.sleep(2000);
		
		carteira.adicionaAcoes("HGLG11", 500);
		
		Thread.sleep(2000);
		
		carteira.adicionaAcoes("FLEURY3", 100);
		
		Thread.sleep(2000);
		
		carteira.adicionaAcoes("PETR3", 300);
	
		Thread.sleep(2000);
		
		carteira.adicionaAcoes("HGLG11", 500);
		
		Thread.sleep(2000);
	}

}
