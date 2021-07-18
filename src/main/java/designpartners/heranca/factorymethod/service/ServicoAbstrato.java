package designpartners.heranca.factorymethod.service;

import designpartners.heranca.factorymethod.dao.DAO;

public abstract class ServicoAbstrato<E> {

	/**
	 * 
	 * Abstracao do metodo de fabrica
	 * 
	 * exemplo de um hook method que é utilizado como um factory method na classe
	 * ServicoAbstrato
	 * 
	 * Com o padrao factory method desaclopamos a dependencia da superclasse de criar um objeto
	 * delegando para as subclasses essa criacao.
	 * @return
	 */
	public abstract DAO<E> getDAO();

}
