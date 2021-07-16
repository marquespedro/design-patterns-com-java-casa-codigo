package designpartners.strategy;

import model.Veiculo;

public interface CalculoValor {

	double calcular(long periodo, Veiculo veiculo);
}
