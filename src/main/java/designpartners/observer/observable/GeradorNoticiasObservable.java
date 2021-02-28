package designpartners.observer.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class GeradorNoticiasObservable extends Observable {


	private List<String> noticias = new ArrayList<>();;

	public void addNoticia(String noticia) {
		noticias.add(noticia);
		setChanged();
		notifyObservers(noticia);
	}
	
	
}
