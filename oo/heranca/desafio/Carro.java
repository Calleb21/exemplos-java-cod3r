package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	String nome;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		velocidadeAtual += 5;
	}
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;		
		} else {
			velocidadeAtual = 0;
		}
	}
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}
}
