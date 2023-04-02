package cursojava;
/*
 * Classe que exemplifica função no Java
 * 
 * Ver~soa 1.0
 * 
 * Autor: Samuel Nojoza * 
 * 
 */
public class Funcoes {

	public static void main(String[] args) {
		
		int result = soma(10,60);
		
		System.out.println(result);
		
		
		quadrado(12);
		String texto = mensagem();
		System.out.println(mensagem());
		olamundo();
		int nota = 6;
		
		//Operador Ternário.
		String resultado = nota>=7?"Você foi aprovado":"Você ficou de recuperação";
		System.out.println(resultado);
		
	}
	//com retorno de tipo int e recebe dois parâmentros
	static int soma(int a, int b) {
		return a + b;
	}
	
	static	void quadrado(int numero) {
		System.out.println(numero*numero); 	
	}
	
	static String mensagem() {
		
		return "Teste de Sitema";
	}		
	
	static void olamundo() {
		System.out.println("Olá Mundo");
	}
	
}