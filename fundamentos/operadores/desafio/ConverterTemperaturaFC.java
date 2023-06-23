package fundamentos.operadores.desafio;

import java.util.Scanner;

public class ConverterTemperaturaFC {
	
	public static void main(String[] args) {
		
		// Convertendo a temperatura de Fahrenheint para Celsius ou Celsius para Fahrenheint!!!
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Fahrenheint para Celsius...digite(1)! Ou Celsius para Fahrenheint...digite(2)!");
		int  resultado = entrada.nextInt();
		
		if(resultado == 1) {
			// Calcular Fahrenheint para Celsius
			
			System.out.println("Voce escolheu Fahrenheint para Celsius!");
			System.out.println("Coloque o valor em Fahreinheint: ");
			
			double valor = entrada.nextDouble();
			double valorFinal = (valor - 32) * 5/9;
			
			System.out.println("O valor de Celsius é: ");
			System.out.println(Math.round(valorFinal * 10) / 10.0 + "°C.");
			
		} else if (resultado ==2) {
			// Calcular Celsius para Fahreinheint
			
			System.out.println("Voce escolheu Celsius para Fahreinheint!");
			System.out.println("Coloque o valor em Celsius: ");
			
			double valor2 = entrada.nextDouble();
			double resultadoFinal = valor2 * 1.8 + 32;
			
			System.out.println("O valor em Fahreinheint é: ");
			System.out.println(Math.round(resultadoFinal * 10) / 10.0 + "°F");
		} else {
			// caso o número não seja 1 e 2
			
			System.out.println("Número inválido!");
		}
		entrada.close();
	}
}

