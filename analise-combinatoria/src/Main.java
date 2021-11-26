import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a quantidade total de elementos do problema (n):");
		Scanner digite 		   = new Scanner(System.in);
		AnaliseCombinatoria AC = new AnaliseCombinatoria(digite.nextInt());
		System.out.println("O n�mero de objetos � igual ao n�mero de posi��es do problema?");
		System.out.println("1 - Sim | 0 - N�o");
		switch (digite.nextInt()) {
			case 1:
				System.out.println("Permuta��o: "+ AC.permutacao());
				break;
			case 0:
				System.out.println("A ordem importa?");
				System.out.println("1 - Sim | 0 - N�o");
				if (digite.nextInt() == 1) {
					System.out.println("Digite a quantidade de elementos selecionados (p): ");
					AC.setElementosSelecionados(digite.nextInt());
					System.out.println("Arranjo: "+AC.arranjo());
					break;
				}
				System.out.println("Digite a quantidade de elementos selecionados (p):");
				AC.setElementosSelecionados(digite.nextInt());
				System.out.println("Combina��o: "+AC.combinacao());
				break;
		}
		
		
	}

}
