import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Bebidas {
	
	public String opcaoBebida;

	public Bebidas() {
		
		String path2 = ("C:\\_ws\\Cardapio\\bebidas-tabuladas.txt");
		String line2 = "";
		
		try {
			BufferedReader br2 = new BufferedReader(new FileReader(path2));
			
			System.out.println();
			System.out.println("---------- Bebidas ----------");
			System.out.println();
			while((line2 = br2.readLine()) !=null) {
				String[] values2 = line2.split("	");
				System.out.println("N: " + values2[1] + " - R$: " + values2[0]);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		Scanner opcao = new Scanner(System.in);
		System.out.println("Digite Número do Prato: ");
		
		opcaoBebida = opcao.nextLine();
		System.out.println("Número do Pedido: " + opcaoBebida);
		
	}

}
