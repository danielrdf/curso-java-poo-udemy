package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.print("Name: ");
		a1.name = sc.nextLine();
		System.out.print("Grade 1: ");
		a1.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		a1.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		a1.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", a1.finalGrade());
		
		if (a1.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", a1.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
		
	}

}
