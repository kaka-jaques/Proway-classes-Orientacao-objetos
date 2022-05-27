package br.com.entra21.kalil.main.aula02.herancas;

public class Modelo {

	private String marca;
	private String modelo;
	private float kmL;
	private float litros;
	
	public Modelo() {
		super();
	}

	public Modelo(String marca, String modelo, float kmL) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.kmL = kmL;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getKmL() {
		return kmL;
	}

	public void setKmL(float kmL) {
		this.kmL = kmL;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}
	
}
