package designpartners.factorymethod.service;

import java.util.Objects;

import designpartners.factorymethod.dao.DAO;
import designpartners.factorymethod.dao.ProdutoDao;
import designpartners.factorymethod.model.Produto;

public class ServicoProduto extends ServicoAbstrato<Produto> {

	private DAO<Produto> dao;

	
	/**
	 * exemplo de um hook method definido na classe ServicoAbstrato 
	 * que implementa o padrao de factory method
	 */
	@Override
	public DAO<Produto> getDAO() {
		
		if(Objects.isNull(dao)) {
			dao = new ProdutoDao();
		}
		
		return dao;
	}
	
	
	

	
	
}
