package exerc_heranca2;

import java.util.Scanner;

public class SerHumano extends Animal {

	Protected static String nome;
	Protected static int idade;
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Informe o tipo");
	tipo = leitor.nextLine();
	
	public String falar(String frase) {
		String frase = "Nem todos falam";
		return frase;
	}
	
}
}