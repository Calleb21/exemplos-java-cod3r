package fundamentos;

import java.util.Scanner;

public class DesafioTemperaturaCelsius {
	
	public static void main(String[] args) {
		// C = 37
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = (celsius - 32 ) / 1.8;
		
		System.out.println("Valor em Fahrenheint: " + conversao);
		
		entrada.close();
				
	}

}
