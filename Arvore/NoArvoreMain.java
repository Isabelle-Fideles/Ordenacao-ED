package projeto2;

import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;

public class NoArvoreMain {

	public static NoArvore inserir(NoArvore p, String in, String pt, int ord) {

		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);

		if (p == null) {
			p = new NoArvore(in, pt);
			return p;
		} else {
			if (ord == 1) {
				if (collator.compare(p.por, pt) < 0) {
					p.R = inserir(p.R, in, pt, ord);
				} else {
					p.L = inserir(p.L, in, pt, ord);
				}
			} else {
				if (collator.compare(p.ing, in) < 0) {
					p.R = inserir(p.R, in, pt, ord);
				} else {
					p.L = inserir(p.L, in, pt, ord);
				}
			}
			return p;
		}
	}

	public static void print(NoArvore p, int ord) {
		if (p != null) {
			print(p.L, ord);
			if (ord == 1)
				System.out.println(p.por + " ---> " + p.ing);
			else
				System.out.println(p.ing + " ---> " + p.por);
			print(p.R, ord);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] dic = { { "ábelha", "bee" }, { "abacaxi", "pineapple" }, { "grito", "scream" }, { "gostar", "like" },
				{ "receoso", "afraid" }, { "Inteligente", "smart" }, { "rainha", "queen" }, { "devaneio", "daydream" },
				{ "dado", "data" }, { "data", "date" } };

		System.out.print("0 - Sair\n1 - Português \n2 - Inglês \n\nTipo de ordenação desejada (1/2): ");
		NoArvore ap = null;
		NoArvore ai = null;
		int opcao = in.nextInt();
		
		for (int i = 0; i < dic.length; i++) {
			ap = inserir(ap, dic[i][1], dic[i][0], 1);
		}
		
		for (int i = 0; i < dic.length; i++) {
			ai = inserir(ai, dic[i][1], dic[i][0], 2);
		}
		
		while (opcao != 0) {
			if (opcao == 1) {
				print(ap, 1);
			} 
			else if (opcao == 2) {
				print(ai, 2);
			} else
				System.out.println("Opção inválida!!!");

			System.out.println();
			System.out.print("Digite outra opção: ");
			opcao = in.nextInt();
		}
	}
}