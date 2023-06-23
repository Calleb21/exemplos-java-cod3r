package fundamentos.operadores.desafio;

import java.util.Scanner;

public class FahrenheitPraCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	   // Tranforme Fahrenheint em Celsius.

		System.out.println("Digite (1) para iniciar!");
		int resultado = entrada.nextInt();
		
		if(resultado == 1) {
			
		System.out.println("Digite o valor em que voce deseja coverter: ");
			
			double valor = entrada.nextDouble();
			double valorFinnal = (valor - 32) * 5/9;
			
			System.out.println("O valor em Celsius é: ");
			System.out.println(Math.round(valorFinnal * 10) / 10.0 + "°C");
		}

		entrada.close();
	}
}
