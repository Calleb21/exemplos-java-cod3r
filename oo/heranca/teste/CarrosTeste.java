package oo.heranca.teste;

import oo.heranca.desafio.Fiat;
import oo.heranca.desafio.Lamborghini;

public class CarrosTeste {

	public static void main(String[] args) {
		
		Fiat c1 = new Fiat();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Lamborghini c2 = new Lamborghini(400);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}
}
