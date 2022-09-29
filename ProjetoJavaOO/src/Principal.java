
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Silvany";
		pessoa1.idade = 41;
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Pedro";
		pessoa2.idade = 45;
		
		
		System.out.println("Nome da pessoa 1 " + pessoa1.nome);
		System.out.println("Idade da pessoa 1 " + pessoa1.idade);
		System.out.println("Nome da pessoa 2 " + pessoa2.nome);			
		System.out.println("Idade da pessoa 2 " + pessoa2.idade);

	}

}
