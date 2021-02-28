package designpartners.observer.observers.carteiracoes;

/**
 * @author Machine
 * 
 * Logger que observa e imprimi os dados das acoes no console
 */
public class AcoesLoggerObservador implements Observador {

	@Override
	public void mudancaQuantidade(String acao, Integer quantidade) {
		System.out.println("Alterada a quantidade da ação : " + acao + " para " + quantidade);
	}

}
