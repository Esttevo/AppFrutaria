package br.com.frutaria.model;

public class Fruta extends Produto {

	private double peso;
	

	public Fruta() {
		super();
		this.peso = 0.0;
	}

	public Fruta(String nome, double peso, int quantidade, String tipo) {
		super (nome, quantidade, tipo);
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
	
