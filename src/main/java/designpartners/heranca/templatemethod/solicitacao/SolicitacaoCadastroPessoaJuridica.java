package designpartners.heranca.templatemethod.solicitacao;

import model.Solicitacao;
import model.TipoSolicitacao;

public class SolicitacaoCadastroPessoaJuridica extends GeradorSolicitacao {

	@Override
	protected void validar(Solicitacao solicitacao) {
		if(!TipoSolicitacao.PJ.equals(solicitacao.getTipo())) {
			throw new RuntimeException("Tipo inválido");
		}
	}

	@Override
	protected void atualizarSituacao(Solicitacao solicitacao) {
		solicitacao.setSituacao("EM ANDAMENTO / COM PENDENCIA");
	}

}
