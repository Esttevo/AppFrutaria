package br.com.frutaria.model;

public class Verdura extends Produto {

	private double preco;

	
	public Verdura() {
		super();
		this.preco = 0.0;
	}

	public Verdura(String nome, int quantidade, String tipo, double preco) {
		
		super(nome, quantidade, tipo);
		this.preco = preco;	
	}
	public double getPreco( ) {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
