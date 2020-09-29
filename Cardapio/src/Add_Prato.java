import java.util.Scanner;

public class Add_Prato {
	
	public Add_Prato() {
		
		int escolha2;
		
		Scanner newCase = new Scanner(System.in);
		System.out.println("Digite: 1 = Pratos - 2 = Bebidas - 3 = Vinhos ");
		escolha2 = newCase.nextInt();
		
		switch(escolha2) {
		
		case 1:
			System.out.println("1 - Pratos");
			
			break;
		case 2:
			System.out.println("2 - Bebidas");
			
			break;
		case 3:
			System.out.println("3 - Vinhos");
			
			break;
		default:
			System.out.println("Opção invalida");
		}	
	}
	
}
