package br.com.entra21.kalil.main.aula02.herancas;

public class Pessoa {

	private String nome;
	private String cpf;
	private String observacao;
	private byte idade;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String cpf, byte idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
