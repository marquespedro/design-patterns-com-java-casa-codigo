package designpartners.state;

import designpartners.state.negocio.SolicitacaoNegocio;
import model.Solicitacao;

public class Main {

	public static void main(String[] args) {

		SolicitacaoNegocio solicitacaoNegocio = new SolicitacaoNegocio();

		Solicitacao solicitacao = solicitacaoNegocio.criar();
		
		System.out.println("1 - " + solicitacao);

		System.out.println("2 - " + solicitacaoNegocio.concluir(solicitacao));

		System.out.println("3 - " + solicitacaoNegocio.assinar(solicitacao));
		
		System.out.println("4 - " + solicitacaoNegocio.transmitir(solicitacao));
		
		System.out.println("5 - " + solicitacaoNegocio.deferir(solicitacao));

	}
}
