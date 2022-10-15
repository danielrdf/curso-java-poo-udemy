package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		String path = "/Users/danielfonseca/Documents/CURSOS E TUTORIAIS/Ûdemy/curso-java-poo-udemy/17. Trabalhando com arquivos/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
