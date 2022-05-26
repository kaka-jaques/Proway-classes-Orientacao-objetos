package br.com.entra21.kalil.main.aula03.poliformismo;

public class Nadador extends Atleta {

	private String ambiente;
	private String equipamento;
	
	public Nadador() {
		
	}

	public Nadador(String ambiente, String equipamento) {
		this.ambiente = ambiente;
		this.equipamento = equipamento;
	}
	
	public Nadador(String nome, byte idade, int qtdPerdeu, int qtdVitoria, String ambiente, String equipamento) {
		
		super(nome, idade, qtdVitoria, qtdPerdeu);
		this.ambiente = ambiente;
		
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	
}
