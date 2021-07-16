package designpartners.strategy;

import model.Constantes;
import model.Veiculo;

/**
 * @author Machine
 * representa a implementacao de um algoritmo para o atributo "calculo" da classe principal
 */
public class CalculoDiaria implements CalculoValor{

		
	private double valorDiaria;

	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	
	@Override
	public double calcular(long periodo, Veiculo veiculo) {
		
		return valorDiaria * Math.ceil(periodo / Constantes.QTD_HORA_DIA);
	}

}
