package designpartners.heranca.factorymethod.service;

import java.util.Objects;

import designpartners.heranca.factorymethod.dao.DAO;
import designpartners.heranca.factorymethod.dao.ProdutoDao;
import model.Produto;

public class ServicoProduto extends ServicoAbstrato<Produto> {


	private DAO<Produto> dao;

	
	/**
	 * 
	 * metodo de fabrica implementado
	 * 
	 * exemplo de um hook method definido na classe ServicoAbstrato 
	 * que delega para esta classe de servico implementar a criacao do DAO
	 * definindo assim  o padrao de factory method.
	 */
	@Override
	public DAO<Produto> getDAO() {
		
		if(Objects.isNull(dao)) {
			dao = new ProdutoDao();
		}
		
		return dao;
	}
	
	
	

	
	
}
