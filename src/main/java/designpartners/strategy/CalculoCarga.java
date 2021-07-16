package designpartners.strategy;

import model.Constantes;
import model.Veiculo;

/**
 * @author Machine
 * representa a implementacao de um algoritmo para o atributo "calculo" da classe principal
 */
public class CalculoCarga implements CalculoValor{

	
	@Override
	public double calcular(long perido, Veiculo veiculo) {
		
		return 250 * Math.ceil(perido / Constantes.QTD_HORA_DIA); 
	}

}
