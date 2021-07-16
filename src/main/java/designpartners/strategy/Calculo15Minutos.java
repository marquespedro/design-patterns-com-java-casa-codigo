package designpartners.strategy;

import model.Constantes;
import model.Veiculo;

public class Calculo15Minutos implements CalculoValor{

	private double valorPeriodo;
		
	public Calculo15Minutos(double valorPeriodo) {
		this.valorPeriodo = valorPeriodo;
	}
	
	
	@Override
	public double calcular(long perido, Veiculo veiculo) {
		
		return valorPeriodo * Math.ceil(perido / Constantes.QTD_MIN_HORA);
	}

}
