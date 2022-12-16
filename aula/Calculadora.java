package aula;

import java.util.Scanner;

public class Calculadora {

	static int soma(int x, int y) {
		return x + y;
	}
	
	static int subtracao(int a, int b) {
		return a - b;
	}
	
	static int multiplicacao(int c, int d) {
		return c * d;
	}
	
	static float divisao(int i, int j) {
		return i/j;
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:  ");
		int valor1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int valor2 = sc.nextInt();
		System.out.println("Informe a opera��o: ");
		String operacao = sc.next();
		
		switch (operacao) {
		case "+":
			System.out.println("O resultado da soma efetuada �: "+soma(valor1, valor2));
			break;
		case "-": 
			System.out.println("O resultado da subtra��o efetuada �: "+subtracao(valor1,valor2));
			break;
		case "*":
			System.out.println("O resultado da multiplica��o efetuada �: "+multiplicacao(valor1, valor2));
			break;
		case "/":
			System.out.println("O resultado da divis�o efetuada �: "+divisao(valor1, valor2));
			break;
		default: 
			System.out.println("N�o entendi a opera��o desejada, informe novamente: ");
			operacao = sc.next();
		}
		sc.close();
	}

}
