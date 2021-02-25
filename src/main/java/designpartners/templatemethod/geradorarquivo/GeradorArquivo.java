package designpartners.templatemethod.geradorarquivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author Pedro
 * 
 * Este padrao TEMPLATE METHOD utiliza-se do methods hook (metodos ganchos) para criar
 * o metodo de template que neste caso os metodos hooks sao 
 * gerarArquivo(String nome, Map<String, Object> propriedades);
 * processar(byte[] bytes);
 * gerarConteudo(Map<String, Object> propriedades);
 *
 * O problema deste padrao é caso exista uma implmementacao que utiliza-se de comportamentos em comum 
 * existentes nas sub-classes. O que pode causar duplicação de codigo
 *
 */
public abstract class GeradorArquivo {

	
	/**
	 * 
	 * modificador de acesso final para nao permitir q as subclasses implementem
	 * este metodo, o que iria causar comportamentos inesperados, tendo em vista 
	 * que este metodo que de fato cria o nosso partner template method 
	 * 
	 * @param nome
	 * @param propriedades
	 * @throws IOException
	 */
	public final void gerarArquivo(String nome, Map<String, Object> propriedades) throws IOException {
		
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		
		bytes = processar(bytes);
		FileOutputStream fileout = new FileOutputStream(nome);
		
		fileout.write(bytes);
		fileout.close();
	}

	
	/**
	 * implementacao default caso nao seja implementado por subclasses
	 * @param bytes
	 * @return array bytes
	 */
	protected  byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}

	protected abstract String gerarConteudo(Map<String, Object> propriedades);

}
