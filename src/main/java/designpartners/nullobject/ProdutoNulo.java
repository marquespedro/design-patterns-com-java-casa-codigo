package designpartners.nullobject;

import model.Produto;

/**
 * @author Machine
 *
 *         O padr�o Null Object [null] prop�e a cria��o de uma classe para
 *         representar objetos nulos em uma aplica��o. Essa classe deve estender
 *         a classe original e implementar seus m�todos de forma a executar o
 *         comportamento esperado da aplica��o quando um valor nulo for
 *         recebido. Dessa forma, em vez de se retornar um valor nulo,
 *         retorna-se uma inst�ncia dessa nova classe. Guerra, Eduardo. Design
 *         Patterns com Java . Casa do C�digo. Edi��o do Kindle.
 */
public class ProdutoNulo extends Produto {

	public ProdutoNulo() {
		super.setNome("Produto Nulo");
		super.setPreco(0);
	}

}
