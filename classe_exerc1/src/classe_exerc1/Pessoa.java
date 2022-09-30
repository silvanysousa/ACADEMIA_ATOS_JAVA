package classe_exerc1;

public class Pessoa {
	public static void main(String[] args) {
				
		public String nomePessoa;
		public int idadePessoa;
		
		public Pessoa(String nome, int idade) {
			nomePessoa = nome;
			idadePessoa = idade;
		}
		
		public Pessoa(int idade) {
			idadePessoa = idade;
		}
		
		System.out.println("Nome: " + nomePessoa);
		System.out.println("Idade: " + idadePessoa);	
		
	}	
}