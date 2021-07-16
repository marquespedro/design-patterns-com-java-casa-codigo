package designpartners.strategy;

import model.Constantes;
import model.Veiculo;

public class CalculoCarga implements CalculoValor{

	
	@Override
	public double calcular(long perido, Veiculo veiculo) {
		
		return 250 * Math.ceil(perido / Constantes.QTD_HORA_DIA); 
	}

}
