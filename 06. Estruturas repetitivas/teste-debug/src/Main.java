import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();
	}
}

/*
 * Quero rodar o debug a partir da linha 13 Marcar breakpoint na linha 13 ->
 * Seleciona linha -> Toggle Breakpoint (cmd shif B) Botão direito na classe ->
 * Debug as -> Java Application -> Yes
 * Quando chegar no breakpoint, os valores das variáveis começarão a aparecer na aba Variables
 * Quando chegar no breakpoint, para executar uma linha: Step Over (F6)
 * Para interromper o debug: Terminate (quadrado vermelho)
 * Para voltar à perspectiva Java -> canto superior direito -> botão Java
 * ou Window -> Perspective -> Open Perspective -> Java
 */