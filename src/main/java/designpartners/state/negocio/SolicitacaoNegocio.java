package designpartners.state.negocio;

import designpartners.state.estados.AnaliseSecretaria;
import designpartners.state.estados.Deferido;
import designpartners.state.estados.EmAndamento;
import designpartners.state.estados.PendenteAssinatura;
import designpartners.state.estados.PendenteEnvio;
import designpartners.state.estados.State;
import model.Requisicao;

public class SolicitacaoNegocio {

	public Requisicao criar() {

		Requisicao solicitacao = new Requisicao();
		State estado = new EmAndamento();
		estado.setSolicitacao(solicitacao);
		estado.emAndamento();
		return solicitacao;
	}

	public Requisicao concluir(Requisicao solicitacao) {

		State estado = new PendenteAssinatura();
		estado.setSolicitacao(solicitacao);
		estado.pendenteAssinatura();
		return solicitacao;
	}

	public Requisicao assinar(Requisicao solicitacao) {

		State estado = new PendenteEnvio();
		estado.setSolicitacao(solicitacao);
		estado.pendenteEnvio();
		return solicitacao;
	}
	
	public Requisicao transmitir(Requisicao solicitacao) {

		State estado = new AnaliseSecretaria();	
		estado.setSolicitacao(solicitacao);
		estado.analiseSecretataria();
		return solicitacao;
	}

	public Requisicao deferir(Requisicao solicitacao) {
		
		State estado = new Deferido();
		estado.setSolicitacao(solicitacao);
		estado.deferido();
		return solicitacao;
	}
}
