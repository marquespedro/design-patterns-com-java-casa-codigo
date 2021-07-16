package designpartners.strategy;

import model.Veiculo;

public class ContaEstacionamento {

	private CalculoValor calculo;
	private Veiculo veiculo;
	private long inicio;
	private long fim;

	public ContaEstacionamento(Veiculo veiculo, long inicio, long fim) {
		this.veiculo = veiculo;
		this.inicio = inicio;
		this.fim = fim;
	}

	public double valorConta() {
		return calculo.calcular(inicio - fim, veiculo);
	}

	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}

}
