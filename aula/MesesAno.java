package aula;

import java.util.Scanner;

public class MesesAno {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		switch (valor) {
		case 1:
			System.out.println("1� m�s: Janeiro");
			break;
		case 2:
			System.out.println("2� m�s: Fevereiro");
			break;
		case 3:
			System.out.println("3� m�s: Mar�o");
			break;
		case 4:
			System.out.println("4� m�s: Abril");
			break;
		case 5:
			System.out.println("5� m�s: Maio");
			break;
		case 6:
			System.out.println("6� m�s: Junho");
			break;
		case 7:
			System.out.println("7� m�s: Julho");
			break;
		case 8:
			System.out.println("8� m�s: Agosto");
			break;
		case 9:
			System.out.println("9� m�s: Setembro"
					+ "");
			break;
		case 10:
			System.out.println("10� m�s: Outubro");
			break;
		case 11:
			System.out.println("11� m�s: Novembro");
			break;
		case 12:
			System.out.println("12� m�s: Dezembro");
			break;
		default:
			System.out.println("O valor n�o corresponde a nenhum m�s");
		}
		sc.close();
	}
		
}
