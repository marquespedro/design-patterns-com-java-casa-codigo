package designpartners.templatemethod.geradorarquivo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Map<String, Object> propriedades = new HashMap<>();
		propriedades.put("nome", "Pedro");
		propriedades.put("idade", "32");
		propriedades.put("endereco", "cep 71699789 brasilia df");

		GeradorArquivo gerador = new GeradorPropriedadesCriptografado(1);
		gerador.gerarArquivo("C:\\Users\\Machine\\arquivo1.txt", propriedades);

		gerador = new GeradorXMLCompactado();
		gerador.gerarArquivo("C:\\Users\\Machine\\arquivo2.txt", propriedades);
	}
}
