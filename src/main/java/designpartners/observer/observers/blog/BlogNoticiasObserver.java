package designpartners.observer.observers.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class BlogNoticiasObserver implements Observer {

	private List<String> noticias = new ArrayList<>();
	
	@Override
	public void update(Observable o, Object novaNoticia) {
		this.noticias.add((String)novaNoticia);
	}

	public List<String> getNoticias() {
		return noticias;
	}




}
