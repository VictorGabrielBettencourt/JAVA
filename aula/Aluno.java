package aula;

public class Aluno {

	String nome = "Alvaro";
	byte idade = 18;
	float altura = 1.73f;
	char primeiraLetra = 'A';
	
	public static void main(String[] args) {

		Aluno alvaro = new Aluno();
		System.out.println("O nome do primeiro code-ranger �: "+alvaro.nome);
		System.out.println("A idadedo primeiro code-ranger �: "+alvaro.idade);
		System.out.println("A altura do primeiro code-ranger �: "+alvaro.altura);
		System.out.println("A primeira letra do nome dele �: "+alvaro.primeiraLetra);
	}

}
