package designpartners.observer;

import designpartners.observer.observable.GeradorNoticiasObservable;
import designpartners.observer.observers.blog.BlogNoticiasObserver;

public class MainBlogNoticia {

	public static void main(String[] args) {

		GeradorNoticiasObservable observavel = new GeradorNoticiasObservable();
		BlogNoticiasObserver observador = new BlogNoticiasObserver();
		
		observavel.addObserver(observador);
	
		observavel.addNoticia("Noticia 1");
		observavel.addNoticia("Noticia 2");
		
		System.out.println(observador.getNoticias());
		

		
	}

}
