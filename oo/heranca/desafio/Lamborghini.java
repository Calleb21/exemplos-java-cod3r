package oo.heranca.desafio;

public class Lamborghini extends Carro {

	public Lamborghini() {
		this(315);
	}
	
	public Lamborghini(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}
	
//	@Override
//	void acelerar() {
//		super.acelerar();;
//	}
}
