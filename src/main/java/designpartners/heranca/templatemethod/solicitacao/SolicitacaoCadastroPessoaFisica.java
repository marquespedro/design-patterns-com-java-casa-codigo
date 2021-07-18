package designpartners.heranca.templatemethod.solicitacao;

import model.Solicitacao;
import model.TipoSolicitacao;

public class SolicitacaoCadastroPessoaFisica extends GeradorSolicitacao {

	@Override
	protected void validar(Solicitacao solicitacao) {
		if(!TipoSolicitacao.PF.equals(solicitacao.getTipo())) {
			throw new RuntimeException("Tipo inválido");
		}
	}



}
