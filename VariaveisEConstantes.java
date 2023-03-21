package cursojava;
/*
 * Classe demonstrativa de variáveis e constantes
 * 
 * versão: 1.0
 * 
 * autor: Samuel Nojoza
 * 
 * */
public class VariaveisEConstantes {

	public static void main(String[] args) {

		//Criação de constante
		final double ACELERACAO_GRAVIDADE_TERRA= 9.80665;
		
		//Criação de variáveis
		String nome= "Samuel";
		
		int idade=45;
		
		double peso=65.8,altura=1.72;
		
		char sexo='M',cnh='A';
		
		boolean doadorOrgaos=false;
		
		System.out.println("Nome: "+nome);
		
		System.out.println("Idade: "+idade);
		
		System.out.println("Peso: "+peso);
		
		System.out.println("Altura: "+altura);
		
		System.out.println("Sexo "+sexo);
		
		System.out.println("Habilitação "+cnh);
		
		System.out.println("Doador de Orgãos "+doadorOrgaos);
		
		System.out.println("Gravidade na Terra é: "+ACELERACAO_GRAVIDADE_TERRA+" m/s2");
				
				
	}

}
