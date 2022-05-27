package br.com.entra21.kalil.main.aula05.interfaces;

public class Pato implements Individuo {

	
	public void alimentar(String comida) {
		
		System.out.println("Pato come "+comida);
		
	}

	@Override
	public void locomover() {
		
		System.out.println("A Pato corre, anda e nada");
		
	}

	@Override
	public void comunicar(String conteudo) {
		
		System.out.println(conteudo);
		
	}

	
	
}
