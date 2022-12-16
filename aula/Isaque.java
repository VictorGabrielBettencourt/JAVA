package aula;

import java.util.Scanner;

public class Isaque {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Boungiorno");
		System.out.println("Digite seu nome :");
		String nome = sc.next();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu Email :");
		String email = sc.next();
		
		System.out.println("Digite sua rua :");
		String rua = sc.next();
		
		System.out.println("Digite seu CEP :");
		int cep = sc.nextInt();
		
		System.out.println("Digite seu numero de celular :");
		int numerocell = sc.nextInt();
		
		System.out.println("Digite seu numero fixo :");
		int numerofixo = sc.nextInt();
		
		cadastro(nome, idade, email, rua, cep, numerocell, numerofixo);
		
		sc.close();
	}
	
	static void cadastro(String nome, int idade, String email, String rua, int cep, int numerocell, int numerofixo) {
		System.out.println("Seu nome  � : " +nome);
		System.out.println("Sua idade  � : " +idade);
		System.out.println("Seu Email  � : " +email);
		System.out.println("Sua rua � : " +rua);
		System.out.println("Seu CEP  � : " +cep);
		System.out.println("Seu n�mero de celular  � : " +numerocell);
		System.out.println("Seu n�mero fixo � : " +numerofixo);
	}
}
