package cursojava;

import java.util.ArrayList;

/*
 * Classe que especifica a criação e manipulação de Arrays * 
 * 
 * Versão: 1.0
 * 
 * Autor: Samuel Nojoza
 * 
 */


public class Vetores {

	public static void main(String[] args) {
	
		//Declaração de um vetor vazio
		int numeros[] = new int[5];
		
		numeros[0] =10;
		numeros[1] =20;
		numeros[2] =30;
		numeros[3] =40;
		numeros[4] =50;
	
		
		System.out.println(numeros[2]);
	
		char consoantes[] = {'b','c','d','f','g'};
		
		System.out.println(consoantes[0]);
		
		ArrayList<Integer> pares = new ArrayList<>();
		
		pares.add(2);
		pares.add(6);
		pares.add(1, 4);
		pares.add(24);
		pares.add(10);
		pares.add(8);
		/*pares.sort(null);*/
		
		System.out.println(pares.get(3));
	
	}
	
	

}
