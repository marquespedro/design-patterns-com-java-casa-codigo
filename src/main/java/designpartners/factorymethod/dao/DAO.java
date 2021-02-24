package designpartners.factorymethod.dao;

import java.util.List;

public interface DAO<E> {

	public E recupearPorId(Object id);

	public void salvar(E entidade);

	public void excluir(Object id);

	public List<E> listarTodos();

}
