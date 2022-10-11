package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de alturas a serem lidas: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura #" + (i + 1) + ": ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", sum / vect.length));

		sc.close();
	}

}
