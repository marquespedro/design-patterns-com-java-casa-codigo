package designpartners.nullobject;

import model.Produto;

/**
 * @author Machine
 *
 *         O padrão Null Object [null] propõe a criação de uma classe para
 *         representar objetos nulos em uma aplicação. Essa classe deve estender
 *         a classe original e implementar seus métodos de forma a executar o
 *         comportamento esperado da aplicação quando um valor nulo for
 *         recebido. Dessa forma, em vez de se retornar um valor nulo,
 *         retorna-se uma instância dessa nova classe. Guerra, Eduardo. Design
 *         Patterns com Java . Casa do Código. Edição do Kindle.
 */
public class ProdutoNulo extends Produto {

	public ProdutoNulo() {
		super.setNome("Produto Nulo");
		super.setPreco(0);
	}

}
