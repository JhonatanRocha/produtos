package br.com.caelum.maven;

public class Produto {
	private final String name;
	private final double preco;
	
	public Produto(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public double getPreco() {
		return preco;
	}
	
}
