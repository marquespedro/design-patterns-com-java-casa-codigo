package designpartners.composicao.bridge.processador;

import java.io.IOException;

public interface PosProcessador {
	
	 byte[] processar(byte[] bytes) throws IOException;
}
