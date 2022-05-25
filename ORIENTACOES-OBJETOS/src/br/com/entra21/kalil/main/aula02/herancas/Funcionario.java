package br.com.entra21.kalil.main.aula02.herancas;

public class Funcionario {

	private String nome;
	private String cargoAtual;
	private String cpf;
	private byte idade;
	private float salario;
	
	public Funcionario() {
		
		
		
	}

	public Funcionario(String nome, String cargoAtual, byte idade, float salario) {
		this.nome = nome;
		this.cargoAtual = cargoAtual;
		this.idade = idade;
		this.salario = salario;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargoAtual() {
		return cargoAtual;
	}

	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
