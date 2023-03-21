package cursojava;

public class MaiorDeDoisNumeros {

	public static void main(String[] args) {
	
	int numero1 = 200, numero2 = 100;
	
	int maior = ((numero1 + numero2) + Math.abs(numero1 -numero2))/2;
	
	System.out.println(maior);
		
	}

}
