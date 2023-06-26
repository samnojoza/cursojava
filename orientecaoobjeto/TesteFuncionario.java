package cursojava.orientecaoobjeto;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		FuncionarioOperacional f1 = new FuncionarioOperacional(1112, "Samuel", "Programador Júnior", 6000.0, "Vendas");
		FuncionarioOperacional f2 = new FuncionarioOperacional(1113, "Maria", "Analista", 10000.0, "Análise"); 
		FuncionarioOperacional f3 = new FuncionarioOperacional(); 
		
		System.out.println(f1.getCadastro());
		System.out.println(f1.getNome());
		System.out.println(f1.getOcupacao());
		System.out.println(f1.getSalario());
		System.out.println(f1.getSetor());	 
			
		f1.verFuncionarios();
		
		System.out.println(f2.getCadastro());
		System.out.println(f2.getNome());
		System.out.println(f2.getOcupacao());
		System.out.println(f2.getSalario());
		System.out.println(f2.getSetor());	 
			
		f2.verFuncionarios();
	
	}
	

}
