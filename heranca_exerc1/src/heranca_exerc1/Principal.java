package heranca_exerc1;

import java.util.Scanner;

import exerc_heranca1.Usuario;

public class Principal extends Usuario {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome");
		nome = leitor.nextLine();
		System.out.println("Digite o e-mail");
		email = leitor.nextLine();
		System.out.println("Digite o telefone");
		telefone = leitor.nextInt();
	}

}
