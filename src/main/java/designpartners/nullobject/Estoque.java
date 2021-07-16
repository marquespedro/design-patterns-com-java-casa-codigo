package designpartners.nullobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import model.Produto;

public class Estoque {

	private List<Produto> produtos;

	public Estoque() {
		this.produtos = new ArrayList<>();
		this.produtos.add(new Produto("ps5" , 5000));
		this.produtos.add(new Produto("xbox" , 1000));
		this.produtos.add(new Produto("controle xbox" , 500));
		this.produtos.add(new Produto("controle ps5" , 100));
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public  Produto consultar(String nome) {
		
		if(Objects.isNull(nome) || nome.isEmpty()) {
			return new ProdutoNulo();
		}
		
		Predicate<Produto> mesmoNome = p -> nome.equals(p.getNome());
		return this.produtos.stream().filter(mesmoNome).findFirst().orElse(new ProdutoNulo());
	} 
	

}
