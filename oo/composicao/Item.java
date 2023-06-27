package oo.composicao;

public class Item {

	String nome;
	int quantiadade;
	double preco;
	Compra compra;
	
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantiadade = quantidade;
		this.preco = preco;
	}
}
