package br.com.entra21.kalil.main.aula04.interfaces;

public class Planta implements Individuo{

	private String nomeCientifico;
	
	public Planta() {
		
	}

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String comida) {
		
		System.out.println(this.nomeCientifico+" - Eu não preciso de "+comida);
		
	}

	@Override
	public void locomover() {
		
		System.out.println("Não ando, nem nado, nem voou :(");
		
	}

	@Override
	public void comunicar(String conteudo) {
		
		System.out.println("...");
		
	}
	
	
	
}
