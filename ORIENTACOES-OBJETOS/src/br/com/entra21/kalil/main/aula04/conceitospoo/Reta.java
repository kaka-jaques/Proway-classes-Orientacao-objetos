package br.com.entra21.kalil.main.aula04.conceitospoo;

public class Reta {

	private Ponto pontoA;
	private Ponto pontoB;
	
	//construtor vazio para come�ar a fazer algo
	public Reta() {
		
	}

	public Reta(Ponto pontoA, Ponto pontoB) {
		super();
		this.pontoA = pontoA;
		this.pontoB = pontoB;
	}

	public Ponto getPontoA() {
		return pontoA;
	}

	public void setPontoA(Ponto pontoA) {
		this.pontoA = pontoA;
	}

	public Ponto getPontoB() {
		return pontoB;
	}

	public void setPontoB(Ponto pontoB) {
		this.pontoB = pontoB;
	}
	
}
