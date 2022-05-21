package br.com.entra21.kalil.main.classes;

public class Professor {

	//atributos static s�o de dom�nio da CLASSE!
	//nenhum objeto tem esse tipo de atributo
	//para acessar ela basta informar a "Classe.oqVcQuer" sem usar o "new"
	public static String instituto = "Proway";
	
	//clase com variaveis private
	//atributos devem ser private e se poss�vel utlizar "get" e "set" 
	//pra quem realmente precisa
	private String nome;
	private byte idade;
	private byte alunos;
	
	public Professor() {
		
		//construtor vazio n�o inicia variaveis
		
	}
	
	//construtor com parametros inicializando e acessando variaveis
	public Professor(String mNome, byte mIdade) {
		
		this.nome = mNome;
		this.idade = mIdade;
		
	}
	
	//m�todo para ler a variavel da classe Professor e enviando para o Main
	public String getNome() {
		return this.nome;
	}
	
	//m�todo para setar a variavel nome recebendo do Main
	public void setNome(String mNome) {
		
		this.nome = mNome;
		
	}
	
}
