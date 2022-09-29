
public class Disciplina {

	public static void main(String[] args) {
		Professor leitorNome = new Professor();
		leitorNome.nome = "Silvany";
		
		Laboratorio leitorLab = new Laboratorio();
		leitorLab.local = "Sala 1";
		
		System.out.println("Nome da professora: " + leitorNome.nome);
		System.out.println("Local da aula: " + leitorLab.local);		
	}
}

