import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade total de elementos do problema (n):");
		Scanner digite 		   = new Scanner(System.in);
		AnaliseCombinatoria AC = new AnaliseCombinatoria(digite.nextInt());
		System.out.println("O número de objetos é igual ao número de posições do problema?");
		System.out.println("1 - Sim | 0 - Não");
		switch (digite.nextInt()) {
			case 1:
				System.out.println("Permutação: "+ AC.permutacao());
				break;
			case 0:
				System.out.println("A ordem importa?");
				System.out.println("1 - Sim | 0 - Não");
				if (digite.nextInt() == 1) {
					System.out.println("Digite a quantidade de elementos selecionados (p): ");
					AC.setElementosSelecionados(digite.nextInt());
					System.out.println("Arranjo: "+AC.arranjo());
					break;
				}
				System.out.println("Digite a quantidade de elementos selecionados (p):");
				AC.setElementosSelecionados(digite.nextInt());
				System.out.println("Combinação: "+AC.combinacao());
				break;
		}
		
		
	}

}
