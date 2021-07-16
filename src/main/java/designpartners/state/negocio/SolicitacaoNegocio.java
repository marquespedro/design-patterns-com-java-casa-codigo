package designpartners.state.negocio;

import designpartners.state.estados.AnaliseSecretaria;
import designpartners.state.estados.Deferido;
import designpartners.state.estados.EmAndamento;
import designpartners.state.estados.PendenteAssinatura;
import designpartners.state.estados.PendenteEnvio;
import designpartners.state.estados.State;
import model.Solicitacao;

public class SolicitacaoNegocio {

	public Solicitacao criar() {

		Solicitacao solicitacao = new Solicitacao();
		State estado = new EmAndamento();
		estado.setSolicitacao(solicitacao);
		estado.emAndamento();
		return solicitacao;
	}

	public Solicitacao concluir(Solicitacao solicitacao) {

		State estado = new PendenteAssinatura();
		estado.setSolicitacao(solicitacao);
		estado.pendenteAssinatura();
		return solicitacao;
	}

	public Solicitacao assinar(Solicitacao solicitacao) {

		State estado = new PendenteEnvio();
		estado.setSolicitacao(solicitacao);
		estado.pendenteEnvio();
		return solicitacao;
	}
	
	public Solicitacao transmitir(Solicitacao solicitacao) {

		State estado = new AnaliseSecretaria();	
		estado.setSolicitacao(solicitacao);
		estado.analiseSecretataria();
		return solicitacao;
	}

	public Solicitacao deferir(Solicitacao solicitacao) {
		
		State estado = new Deferido();
		estado.setSolicitacao(solicitacao);
		estado.deferido();
		return solicitacao;
	}
}
