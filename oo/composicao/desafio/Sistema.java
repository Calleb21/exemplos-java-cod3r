package oo.composicao.desafio;

import java.text.DecimalFormat;

public class Sistema {

	public static void main(String[] args) {		
		
		Compra compra1 = new Compra();
		compra1.adicionaItem("Caneta", 9.67, 2);
		compra1.adicionaItem(new Produto("Notebook", 4750.88), 2);

	    Compra compra2 = new Compra();
	    compra2.adicionaItem("Caderno", 29.99, 3);
	    compra2.adicionaItem(new Produto("Tablet", 8750.88), 1);
	
    	Cliente cliente = new Cliente("Calleb Camargo");
    	cliente.adicionarCompra(compra1);
    	cliente.compras.add(compra2);
    	
    	DecimalFormat deci = new DecimalFormat("0.00");
	    System.out.println(deci.format (cliente.obterValorTotal()));
  }
}
