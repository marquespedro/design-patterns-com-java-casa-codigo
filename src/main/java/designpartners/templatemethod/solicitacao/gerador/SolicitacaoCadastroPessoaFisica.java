package designpartners.templatemethod.solicitacao.gerador;

import designpartners.templatemethod.solicitacao.model.Solicitacao;
import designpartners.templatemethod.solicitacao.model.TipoSolicitacao;

public class SolicitacaoCadastroPessoaFisica extends GeradorSolicitacao {

	@Override
	protected void validar(Solicitacao solicitacao) {
		if(!TipoSolicitacao.PF.equals(solicitacao.getTipo())) {
			throw new RuntimeException("Tipo inválido");
		}
	}



}
