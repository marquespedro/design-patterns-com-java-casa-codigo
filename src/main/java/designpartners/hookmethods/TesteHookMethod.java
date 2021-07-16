package designpartners.hookmethods;

public class TesteHookMethod {

	public static void main(String[] args) {
		Agendador agendador = new AgendadorTarefaSimples();
		agendador.executarLogica();
		
		Agendador agendadorCompexo = new AgendadorTarefaComplexo();
		agendadorCompexo.executarLogica();
		
	}
}
