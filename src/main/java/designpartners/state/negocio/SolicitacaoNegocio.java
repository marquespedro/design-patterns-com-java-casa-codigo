package designpartners.state.negocio;

import designpartners.state.estados.AnaliseSecretaria;
import designpartners.state.estados.Deferido;
import designpartners.state.estados.EmAndamento;
import designpartners.state.estados.PendenteAssinatura;
import designpartners.state.estados.PendenteEnvio;
import designpartners.state.estados.State;
import designpartners.state.model.SolicitacaoModel;

public class SolicitacaoNegocio {

	public SolicitacaoModel criar() {

		SolicitacaoModel solicitacao = new SolicitacaoModel();
		State estado = new EmAndamento();
		estado.setSolicitacao(solicitacao);
		estado.emAndamento();
		return solicitacao;
	}

	public SolicitacaoModel concluir(SolicitacaoModel solicitacao) {

		State estado = new PendenteAssinatura();
		estado.setSolicitacao(solicitacao);
		estado.pendenteAssinatura();
		return solicitacao;
	}

	public SolicitacaoModel assinar(SolicitacaoModel solicitacao) {

		State estado = new PendenteEnvio();
		estado.setSolicitacao(solicitacao);
		estado.pendenteEnvio();
		return solicitacao;
	}
	
	public SolicitacaoModel transmitir(SolicitacaoModel solicitacao) {

		State estado = new AnaliseSecretaria();	
		estado.setSolicitacao(solicitacao);
		estado.analiseSecretataria();
		return solicitacao;
	}

	public SolicitacaoModel deferir(SolicitacaoModel solicitacao) {
		
		State estado = new Deferido();
		estado.setSolicitacao(solicitacao);
		estado.deferido();
		return solicitacao;
	}
}
