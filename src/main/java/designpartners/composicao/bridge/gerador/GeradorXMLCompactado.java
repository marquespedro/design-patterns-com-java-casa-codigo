package designpartners.composicao.bridge.gerador;

import java.util.Map;

public class GeradorXMLCompactado extends GeradorArquivo{


	@Override
	protected String gerarConteudo(Map<String, Object> props) {

		StringBuilder propFileBuilder = new StringBuilder();

		propFileBuilder.append("<properties>");

		for (String prop : props.keySet()) {

			propFileBuilder.append("<" + prop + ">" + props.get(prop) + "</" + prop + ">");

		}

		propFileBuilder.append("</properties>");

		return propFileBuilder.toString();
	}

}
