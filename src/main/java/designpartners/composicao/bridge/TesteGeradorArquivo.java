package designpartners.composicao.bridge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import designpartners.composicao.bridge.gerador.GeradorArquivo;
import designpartners.composicao.bridge.gerador.GeradorPropriedadesCriptografado;
import designpartners.composicao.bridge.gerador.GeradorXMLCompactado;
import designpartners.composicao.bridge.gerador.GeradorXMLCriptografado;
import designpartners.composicao.bridge.processador.Compactador;
import designpartners.composicao.bridge.processador.Criptografador;

public class TesteGeradorArquivo {

	public static void main(String[] args) throws IOException {

		GeradorArquivo gerador = null;

		Map<String, Object> propriedades = new HashMap<>();
		propriedades.put("nome", "Pedro");
		propriedades.put("idade", "32");
		propriedades.put("endereco", "cep 71699789 brasilia df");

		gerador = new GeradorPropriedadesCriptografado();
		gerador.setPosProcessador(new Criptografador(1));
		gerador.gerarArquivo("C:\\Users\\Machine\\propriedadesCriptografado.txt", propriedades);

		gerador = new GeradorXMLCompactado();
		gerador.setPosProcessador(new Compactador());
		gerador.gerarArquivo("C:\\Users\\Machine\\xmlCompactado.txt", propriedades);

		gerador = new GeradorXMLCriptografado();
		gerador.setPosProcessador(new Criptografador(3));
		gerador.gerarArquivo("C:\\Users\\Machine\\xmlCriptografado.txt", propriedades);
	}
}
