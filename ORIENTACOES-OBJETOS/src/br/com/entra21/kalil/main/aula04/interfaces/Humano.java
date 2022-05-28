package br.com.entra21.kalil.main.aula04.interfaces;

import br.com.entra21.kalil.main.aula02.herancas.Pessoa;

public class Humano extends Pessoa implements Individuo {

	public Humano() {
		
	}
	
	public void apresentarSe() {
		
		System.out.println("Oi, meu nome é "+getNome());
		
	}

	@Override
	public void alimentar(String comida) {
		
		System.out.println(getNome()+" - eu posso comer quase de tudo, inclusive "+comida);
		
	}

	@Override
	public void locomover() {
		System.out.println(getNome()+" - eu posso andar e correr, menos voar :(");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(getNome()+" ");
		
	}
	
}
