package aula;

public class StaticEPublic {

	public static void metodoEstatico() {
		System.out.println("M�todo Global");
	}
	
	public void metodoDinamico() {
		System.out.println("M�todo Local");
	}
	
	public static void main(String[] args) {
		metodoEstatico();
//		metodoDinamico();
		
		StaticEPublic exibir = new StaticEPublic();
		exibir.metodoDinamico();
	}

}
