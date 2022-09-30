package classe_exerc2;

public class Aluno {
	
	public String nomeAluno;
	public int matriculaAluno;
	public int dataNascimento;
	public int anoIngresso;
	
	
	public Aluno(String nome, int matricula) {
		nomeAluno = nome;
		matriculaAluno = matricula;
	}
	
	public Aluno(int data) {
		dataNascimento = data;
	}

	public Aluno(String nome, int data, int ano) {
		nomeAluno = nome;
		dataNascimento = data;
		anoIngresso = ano;
	}

}
