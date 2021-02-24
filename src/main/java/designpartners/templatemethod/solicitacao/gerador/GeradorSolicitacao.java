package designpartners.templatemethod.solicitacao.gerador;

import designpartners.templatemethod.solicitacao.model.Solicitacao;

/**
 * @author Machine
 * 
 * Template Method é um padrao que se utiliza de herança para ser implementado.
 * 
 */
public abstract class GeradorSolicitacao {

	protected  abstract void validar(Solicitacao solicitacao);
	
	public final  void criar(Solicitacao solicitacao) {
		
		validar(solicitacao);
		
		atualizarSituacao(solicitacao);
		
		imprimir(solicitacao);
		
	}
		
	
	protected  void atualizarSituacao(Solicitacao solicitacao) {
		solicitacao.setSituacao("EM ANDAMENTO");
	}
	
	protected void imprimir(Solicitacao solicitacao) {
		System.out.println(solicitacao.toString());
	}
}
