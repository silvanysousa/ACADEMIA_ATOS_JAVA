package exerc_heranca2;

import java.util.Scanner;

public class Pessoa extends SerHumano {
	
	public static void main(String[] args) {	
	
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("Informe o nome");
		nome = leitor.nextLine();
		System.out.println("Informe a idade");
		idade = leitor.nextInt();
		
		
	}	

}
