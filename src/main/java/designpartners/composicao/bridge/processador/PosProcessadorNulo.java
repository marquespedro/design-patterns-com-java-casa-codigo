package designpartners.composicao.bridge.processador;

import java.io.IOException;

public class PosProcessadorNulo implements PosProcessador {

	@Override
	public byte[] processar(byte[] bytes) throws IOException {
		return bytes;
	}

}
