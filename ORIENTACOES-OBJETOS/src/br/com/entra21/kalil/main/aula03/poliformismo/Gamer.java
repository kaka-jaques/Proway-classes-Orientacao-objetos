package br.com.entra21.kalil.main.aula03.poliformismo;

public class Gamer extends Atleta {

	private String categoriaFavorita;
	private String configuracao;
	
	public Gamer() {
		
	}

	public Gamer(String categoriaFavorita, String configuracao) {
		this.categoriaFavorita = categoriaFavorita;
		this.configuracao = configuracao;
	}
	
	public Gamer(String nome, byte idade, int qtdWin, int qtdLost, String cat, String config) {
		
		super(nome, idade, qtdWin, qtdLost);
		this.categoriaFavorita = cat;
		this.configuracao = config;
		
	}

	public String getCategoriaFavorita() {
		return categoriaFavorita;
	}

	public void setCategoriaFavorita(String categoriaFavorita) {
		this.categoriaFavorita = categoriaFavorita;
	}

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	public void agradecerVitoria() {
		setQuantidadeVitorias(getQuantidadeVitorias()+1);
		System.out.println("Eu sou o melhor!! "+getNome()+", "+getQuantidadeVitorias()+" vitórias e "+getQuantidadeDerrotas()+" derrotas");
		
	}
	
}
