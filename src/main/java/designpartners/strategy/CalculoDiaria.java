package designpartners.strategy;

import model.Constantes;
import model.Veiculo;

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
