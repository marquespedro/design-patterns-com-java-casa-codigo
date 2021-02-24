package designpartners.factorymethod.service;

import designpartners.factorymethod.dao.DAO;

public abstract class ServicoAbstrato<E> {

	public abstract DAO<E> getDAO();

}
