import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char w;
		
		String s1, s2, s3;
		
		System.out.print("Digite uma palavra: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		System.out.print("Digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		System.out.print("Digite um número com ponto flutuante: ");
		z = sc.nextDouble();
		System.out.println("Você digitou: " + z);
		
		System.out.print("Digite um caractere: ");
		w = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Você digitou: " + w);
		
		System.out.print("Digite uma linha: ");
		s1 = sc.nextLine();
		System.out.print("Digite outra linha: ");
		s2 = sc.nextLine();
		System.out.print("Digite mais uma linha: ");
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
