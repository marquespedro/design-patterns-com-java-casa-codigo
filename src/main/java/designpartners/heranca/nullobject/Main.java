package designpartners.heranca.nullobject;

import model.Produto;

/**
 * @author Machine
 * 
 * o metodo consultar de estoque � um exemplo do padrao null object que  retorna uma instancia de ProdutoNulo 
 * caso nenhum produto seja encontrado,  assim evitamos retornar um valor null. 
 */
public class Main {

	public static void main(String[] args) {

		Estoque estoque = new Estoque();
		
		Produto produto = estoque.consultar(null);
		
		System.out.println(produto);
	
		produto = estoque.consultar("ps5");
	
		System.out.println(produto);
		
	}

}
