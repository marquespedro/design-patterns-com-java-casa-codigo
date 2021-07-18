package designpartners.heranca.templatemethod.solicitacao;

import model.Solicitacao;
import model.TipoSolicitacao;

public class Main {

	public static void main(String[] args) {

		GeradorSolicitacao gerador = null;
		gerador = new SolicitacaoCadastroPessoaJuridica();
		gerador.criar(new Solicitacao(10, TipoSolicitacao.PJ));

		gerador = new SolicitacaoCadastroPessoaFisica();
		gerador.criar(new Solicitacao(20, TipoSolicitacao.PF));
		
		
	}
}
