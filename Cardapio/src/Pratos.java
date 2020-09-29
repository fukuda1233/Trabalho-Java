import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pratos {
	
	public String opcaoPratos;

	public Pratos() {
		
		String path = ("C:\\_ws\\Cardapio\\pratos.csv");
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			System.out.println();
			System.out.println("--------- Cardapio ----------");
			System.out.println();
			while((line = br.readLine()) !=null) {
				String[] values = line.split(";");
				System.out.println("N: " + values[0] + " - R$: " + values[1]);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		Scanner opcao = new Scanner(System.in);
		System.out.println("Digite Número do Prato: ");
		
		opcaoPratos = opcao.nextLine();
		System.out.println("Número do Pedido: " + opcaoPratos);
				
	}

}
