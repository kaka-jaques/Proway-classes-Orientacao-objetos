package br.com.entra21.kalil.main.aula05.revisao;

public interface comportamentosAcademicos {

	//deve ser publico pois o objetivo é as classes terem acesso
	//neste caso, retorna uma String
	//que pode ser aproveitado em um Syso, alimentar variaveis, participar de um calculo, etc
	public String realizarApresentacao();
	public String gerarDossie(String nome);
	
}
