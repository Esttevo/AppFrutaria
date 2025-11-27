package br.com.frutaria.model;

public class Produto {

	protected String nome;
	protected int quantidade;
	protected String tipo;
	protected static int contador;
	protected final int codigo;
	
	public Produto() {
		this.nome = "";
		this.quantidade = 0;
		this.tipo = "";
		this.codigo = contador++;
	}
	public Produto(String nome, int quantidade, String tipo) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.codigo = contador++;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome ) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return this.quantidade;
	} 
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return this.tipo;
	} 
	public void setTipo(String tipo) {
	this.tipo = tipo;
	}
	public int getCodigo( ) {
		return this.codigo;
	}
}
