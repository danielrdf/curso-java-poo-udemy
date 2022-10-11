package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		r1.width = sc.nextDouble();
		r1.height = sc.nextDouble();
		
		r1.area();
		r1.perimeter();
		r1.diagonal();
		
		System.out.println(r1);
		
		sc.close();
		
	}

}
