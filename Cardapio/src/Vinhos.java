import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vinhos {
	
	public String opcaoVinho;

	public Vinhos() {
		
		String path3 = ("C:\\_ws\\Cardapio\\vinhos-tabulados.txt");
		String line3 = "";
		
		try {
			BufferedReader br3 = new BufferedReader(new FileReader(path3));
			
			System.out.println();
			System.out.println("--------- Cardapio ----------");
			System.out.println();
			while((line3 = br3.readLine()) !=null) {
				String[] values3 = line3.split("	");
				System.out.println("N: " + values3[1] + " - R$: " + values3[0]);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		Scanner opcao = new Scanner(System.in);
		System.out.println("Digite Número do Prato: ");
		
		opcaoVinho = opcao.nextLine();
		System.out.println("Número do Pedido: " + opcaoVinho);
		
		opcao.close();
	}

}
