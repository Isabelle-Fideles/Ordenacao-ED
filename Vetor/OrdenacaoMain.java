package projeto2;

import java.util.Scanner;

public class OrdenacaoMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] dic = { { "abelha", "bee" }, { "abacaxi", "pineapple" }, { "grito", "scream" }, { "gostar", "like" },
				{ "receoso", "afraid" }, { "Inteligente", "smart" }, { "rainha", "queen" }, { "devaneio", "daydream" },
				{ "dado", "data" }, { "data", "date" } };

		System.out.print("1- Português \n2- Inglês \nTipo de ordenação desejada (1/2): ");
		int opcao = in.nextInt();
		if ((opcao == 1) || (opcao == 2)) { 
			Ordenacao.ordenar(dic, opcao);
			for (int i = dic.length; i > 0; i--) {
				int cont = 0, aux = 0, comp = 0; 
				cont = opcao == 1 ? 0 : 1;
				aux = cont == 0 ? 1 : -1;
				comp = cont == 0 ? 2 : -1;
				while (cont != comp) { 
					System.out.print("|" + dic[i - 1][cont] + " ");
					cont = cont + aux;
				}
				System.out.println();
			}
		} else
			System.out.println("Opção Inválida!!!");
	}
}
