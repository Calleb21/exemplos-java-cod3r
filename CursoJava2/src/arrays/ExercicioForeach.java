package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 6.9;
		notasAlunoA[1] = 7;
		notasAlunoA[2] = 7.7;
		notasAlunoA[3] = 9.7;

		double totalAlunoA = 0;
		for (double notas : notasAlunoA) {
			totalAlunoA += notas;
		}
		System.out.print("\nMedia alunoA: " + totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = { 8.9, 8, 6.5, 10 };
		
		double totalALunoB = 0;
		for(double notasB: notasAlunoB) {
			totalALunoB += notasB;
		}
		System.out.print("\nMedia alunoB: " + totalALunoB / notasAlunoB.length);
	}
}
