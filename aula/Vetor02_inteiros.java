package aula;

import java.util.Scanner;

public class Vetor02_inteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[5];
		
		for (byte i = 0; i < numeros.length; i++) {
			System.out.println("Informe um valor: ");
			numeros[i] = sc.nextInt();
		}
		for (byte contadora = 0; contadora < numeros.length; contadora++) {
			System.out.println("O n�mero informado na "+(contadora+1)+"� posi��o �: "+numeros[contadora]);
		}
		sc.close();

	}

}
 