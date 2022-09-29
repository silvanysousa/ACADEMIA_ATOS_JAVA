import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Carro carro = new Carro();
		
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();
		
		System.out.println("Digite a marca da moto");
		moto1.marca = leitor.nextLine();
		
		System.out.println("Digite o modelo da moto");
		moto1.modelo = leitor.nextLine();
		
		System.out.println("Digite a cilindrada da moto");
		moto1.cilindrada = leitor.nextInt();
		
		System.out.println("Digite a marca da moto");
		moto2.marca = leitor.nextLine();
		
		System.out.println("Digite o modelo da moto");
		moto2.modelo = leitor.nextLine();
		
		System.out.println("Digite a cilindrada da moto");
		moto2.cilindrada = leitor.nextInt();
		
		System.out.println("Marca: " + moto1.marca);
		System.out.println("Modelo: " + moto1.modelo);
		System.out.println("Cilindrada: " + moto1.cilindrada);
	}

}
