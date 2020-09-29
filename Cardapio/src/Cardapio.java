import java.util.Scanner;

public class Cardapio {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("---------- Escolha ----------");
		System.out.println("Cardapio = true - Add Itens = false");
		System.out.println();
		
		boolean escolha = leitor.nextBoolean();
		
		if(escolha == true) {
			System.out.println("(X) Cardapio - ( ) Add Itens");
			
			Scanner opcao = new Scanner(System.in);
			
			Pratos s = new Pratos();
			Bebidas s2 = new Bebidas();
			Vinhos s3 = new Vinhos();
			
			System.out.println("-----------------------------");
			System.out.println("Seu Pedido é: " + s.opcaoPratos + " - " + s2.opcaoBebida + " - " + s3.opcaoVinho);
			
			
			System.out.println("Gostaria de Fazer Alguma Observação?");
			System.out.println("1 = Sim - 2 = Não");
			int escolha3;
			escolha3 = opcao.nextInt();
			switch(escolha3) {
			
			case 1:
				System.out.println("1 - Sim");
				
				break;
			case 2:
				System.out.println("2 - Não");
				
				break;
			default:
				System.out.println("Opção Invalida");
			}
			
			opcao.close();
			
		}else {
			System.out.println("( ) Cardapio - (X) Add Itens");
			
			Add_Prato s4 = new Add_Prato();
			
		}
		
		leitor.close();
		
	}
}
