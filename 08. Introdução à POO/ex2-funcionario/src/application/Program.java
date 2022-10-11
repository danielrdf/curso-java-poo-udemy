package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		System.out.print("Name: ");
		e1.name = sc.nextLine();
		System.out.print("Gross salary: ");
		e1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e1.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + e1);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e1.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + e1);
		
		sc.close();
		
	}

}
