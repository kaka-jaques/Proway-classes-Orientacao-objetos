package br.com.entra21.kalil.main.aula05.revisao;

public class Disciplina {

	//atributos da classe
	private String nome;
	private String assunto[];
	private float nota;
	
	//construtor vazio para chamar
	public Disciplina() {
		
	}

	//construtor com atributos
	public Disciplina(String nome, String[] assunto, float nota) {
		super();
		this.nome = nome;
		this.assunto = assunto;
		this.nota = nota;
	}

	//encapsulamento de valores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getAssunto() {
		return assunto;
	}

	public void setAssunto(String[] assunto) {
		this.assunto = assunto;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
}
