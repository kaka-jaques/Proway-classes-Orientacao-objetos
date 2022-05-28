package br.com.entra21.kalil.main.aula04.interfaces;

import br.com.entra21.kalil.main.aula02.herancas.Modelo;

public class Carro extends Modelo implements Maquina {
	
	public Carro() {
		
	}

	public Carro(String marca, String modelo, float kmL) {
		super(marca, modelo, kmL);
	}

	@Override
	public float abastecer(float litros) {
		
		float cxb;
		return (cxb = litros*getKmL());
		
	}

	@Override
	public short velocidade(short velocidade) {
		
		return 244;
		
	}

}
