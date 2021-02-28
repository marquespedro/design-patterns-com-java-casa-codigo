package designpartners.state;

import designpartners.state.model.SolicitacaoModel;
import designpartners.state.negocio.SolicitacaoNegocio;

public class Main {

	public static void main(String[] args) {

		SolicitacaoNegocio solicitacaoNegocio = new SolicitacaoNegocio();

		SolicitacaoModel solicitacao = solicitacaoNegocio.criar();
		
		System.out.println("1 - " + solicitacao);

		System.out.println("2 - " + solicitacaoNegocio.concluir(solicitacao));

		System.out.println("3 - " + solicitacaoNegocio.assinar(solicitacao));
		
		System.out.println("4 - " + solicitacaoNegocio.transmitir(solicitacao));
		
		System.out.println("5 - " + solicitacaoNegocio.deferir(solicitacao));

	}
}
