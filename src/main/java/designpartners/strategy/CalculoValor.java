package designpartners.strategy;

import model.Veiculo;

/**
 * @author Machine
 * representa a abstracao do algortimo que sera intercambiavel
 */
public interface CalculoValor {

	double calcular(long periodo, Veiculo veiculo);
}
