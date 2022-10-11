package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vet[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAlturas = 0.0;
		int cont = 0;

		for (int i = 0; i < vet.length; i++) {
			somaAlturas += vet[i].getAltura();
			if (vet[i].getIdade() < 16) {
				cont++;
			}
		}

		double mediaAlturas = somaAlturas / vet.length;
		double menor16 = cont * 100.0 / vet.length ;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAlturas);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menor16);

		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}

		sc.close();
	}

}
