package designpartners.bridge;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

import designpartners.bridge.processador.PosProcessador;
import designpartners.bridge.processador.PosProcessadorNulo;

/**
 * @author Pedro
 * 
 * O padrao bridge utiliza-se de heranca e composicao ao mesmo tempo
 * 
 * Neste exemplo cobinamos os padroes 
 * 
 *  1 - template method (classe GeradorArquivo metodo gerarArquivo)
 *  2 - bridge (interface PosProcessador)
 *  3 - null object (PosProcessadorNulo) 
 *  4 - hook class (PosProcessador)
 *  5 - hook methods (gerarConteudo)
 * 
 * Como no java nao existe heranca multipla, o padrao bridge pode auxiliar no compartilhamento de codigo
 * entre subclasses, de forma a evitar duplicacao de codigo. 
 * 
 * Neste exemplo reimplementamos o gerador de arquivo utilizando-se da composicao  do posProcessador, 
 * no exemplo de template method veja que nao e possivel reutilizar o codigo de criptografar, ja com 
 * o padrao bridge a solucao fica bem mais flexivel.
 *
 * Um outro efeito colateral interessante e que a classe que implmementam um pos processamento podem ser utilizadas 
 * em um outro contexto de funcionalidade. 
 *  
 */
public abstract class GeradorArquivo {

	
	/**
	 * é a ponte (bridge) para compartilahr o codigo comum entre subclasses e evitar a duplicacao de codigo
	 */
	private PosProcessador posProcessador;
	
	/**
	 * 
	 * modificador de acesso final para nao permitir q as subclasses implementem
	 * este metodo, o que iria causar comportamentos inesperados, tendo em vista 
	 * que este metodo que garante o fluxo de execucao
	 * 
	 * @param nome
	 * @param propriedades
	 * @throws IOException
	 */
	public final void gerarArquivo(String nome, Map<String, Object> propriedades) throws IOException {
		
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		
		bytes =  posProcessador.processar(bytes);
		FileOutputStream fileout = new FileOutputStream(nome);
		
		fileout.write(bytes);
		fileout.close();
	}

	
	protected abstract String gerarConteudo(Map<String, Object> propriedades);


	public void setPosProcessador(PosProcessador posProcessador) {
		if(Objects.isNull(posProcessador)) {
			this.posProcessador = new PosProcessadorNulo();
			return;
		}
		this.posProcessador = posProcessador;
	}

	
}
