package designpartners.nullobject;

import designpartners.factorymethod.model.Produto;

public class ProdutoNulo extends Produto {

	public ProdutoNulo() {
		super.setNome("Produto Nulo");
		super.setPreco(0);
	}

}
