package aula;

public class Parametros {
	
	public static void meuMetodo(String fname) {
		System.out.println(fname + ", ta f�cil?");
	}
	
	public static void main(String[] args) {
		meuMetodo("Alvaro");
		meuMetodo("Isaque");
		meuMetodo("Felipe");
	}

}
