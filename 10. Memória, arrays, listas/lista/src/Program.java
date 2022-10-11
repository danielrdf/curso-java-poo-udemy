import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // não aceita tipos primitivos, por exemplo "List<int>" daria erro

		list.add("Maria");
		list.add("Anna");
		list.add("Alex");
		list.add("Bob");
		list.add("Adrian");
		list.add("Alfred");
		list.add("Margaret");

		// inserindo elemento entre Anna e Alex
		list.add(2, "Marco");

		System.out.println("-------------------------------");
		System.out.println("A lista está com " + list.size() + " elemento(s).");
		for (String x : list) {
			System.out.println(x);
		}
		
		// removendo Anna
		list.remove("Anna");

		System.out.println("-------------------------------");
		System.out.println("A lista está com " + list.size() + " elemento(s).");
		for (String x : list) {
			System.out.println(x);
		}

		// removendo elemento posição 1
		list.remove(1);

		System.out.println("-------------------------------");
		System.out.println("A lista está com " + list.size() + " elemento(s).");
		for (String x : list) {
			System.out.println(x);
		}

		// removendo todos os elementos que começam com a letra M
		list.removeIf(x -> x.charAt(0) == 'M'); // removendo a partir de um Predicado (função Lambda que retorna verdadeiro ou falso)

		System.out.println("-------------------------------");
		System.out.println("A lista está com " + list.size() + " elemento(s).");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); 
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Index of alguém que não está na lista

		// filtrar todos os elementos que começam com a letra A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		System.out.println("-------------------------------");
		for (String x : result) {
			System.out.println(x);
		}

		// encontrando primeiro elemento que comece com 'Al'
		String name = list.stream().filter(x -> x.substring(0, 2).equals("Al")).findFirst().orElse(null);

		System.out.println("-------------------------------");
		System.out.println(name);

	}

}


