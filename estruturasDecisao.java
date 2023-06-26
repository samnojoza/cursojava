package cursojava;

public class estruturasDecisao {

	public static void main(String[] args) {
		
		
		String texto = 10==9?"Dez é igual a nove":"Dez é diferente de 9";
		//Teste lógico 10==9?
		//if
		/*if(idade>=18) {
			System.out.println("Já pode tirar a CNH");
		}
		
		//if.else
		int idade =16;
		if(idade>=18) {
			System.out.println("Pode tirar a CNH");
		}else {
			System.out.println("Não possui idade para tirar a CNH");
				
		}
		*/
		
		/*
		String semaforo = "apagado";
		
		if(semaforo=="verde") {
			System.out.println("Siga em frente!");
			
		}else if(semaforo=="amarelo") {
				System.out.println("Atenção ao cruzar a via!");
			
		}else if(semaforo=="vermelho") {
				System.out.println("Pare! Não atravesse a via!");
			
		}else {
				System.out.println("Chamar a Autarquia de Trânsito!");
		
		}
		*/
		
		//Estrutura de decisão Switch
		char opcao = 'c';
		
		switch(opcao) {
		
		case 'a' : System.out.println("Novo Jogo"); break;
		
		case 'b' : System.out.println("Carregar Jogo"); break;
		
		case 'c' : System.out.println("Sair da partida"); break;
		
		case 'd' : System.out.println("Salvamento Automâtico"); break;
		
		default: System.out.println("Opção Invalida"); ;
		
		}
	}

}
