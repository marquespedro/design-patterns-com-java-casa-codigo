package designpartners.heranca.hookmethods;

/**
 * @author Machine
 * 
 * Um importante uso que pode ser feito da herança é para permitir a especialização de comportamento.
 * Guerra, Eduardo. Design Patterns com Java . Casa do Código. Edição do Kindle. 
 * 
 * Essa prática é muito utilizada em frameworks para permitir que as aplicações possam especializar seu comportamento para seus requisitos.
 * Guerra, Eduardo. Design Patterns com Java . Casa do Código. Edição do Kindle. 
 */
public abstract class Agendador {

	
	/**
	 * Metodo principal publico que executa toda logica
	 */
	public void executarLogica() {
		checarTarefaValida();
		executar();
		executandoTarefa();
		finalizarTarefa();
	}
	
	private void checarTarefaValida() {
		System.out.println("Checando tarefa é valida ...");
		
		System.out.println("Tarefa validada com sucesso ...");
		
	}
	
	private void executandoTarefa() {
		System.out.println("Executando tarefa ...");
	}
	
	private void finalizarTarefa() {
		System.out.println("Finalizando tarefa ... \n \n");
	}

	/**
	 * hook method ou metodo gancho que representa o ponto de extensão 
	 * que e implementado pelas subclasses 
	 */
	public abstract void executar();
	

}
