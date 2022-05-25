package br.com.entra21.kalil.main.aula02.herancas;

public class Diretor extends Pessoa {

	//atributos comuns (nome, idade e cpf) deletados
	private String curso;
	private byte qtdProfessores;
	
	public Diretor() {
		super();
	}
	
	
	
	public Diretor(String nome, String cpf, String curso, byte idade, byte qtdProfessores ) {
		super(nome, cpf, idade);
		
		this.curso = curso;
		this.qtdProfessores = qtdProfessores;
	}



	public void realizarApresentacao() {
		
		System.out.println("Oi, meu nome é "+getNome()+" e tenho "+getIdade());
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public byte getQtdProfessores() {
		return qtdProfessores;
	}

	public void setQtdProfessores(byte qtdProfessores) {
		this.qtdProfessores = qtdProfessores;
	}

}
