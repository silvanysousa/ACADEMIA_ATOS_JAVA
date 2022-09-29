public class Carro {
	public String fabricante = "VW";
	public String modelo = "Jetta";
	
	public void ligar() {
		System.out.println("Carro ligado");
	}
	
	public void desligar() {
		System.err.println("Carro desligado");
	}

	public void exibirDados() {
		System.err.println("Dados do carro " + fabricante + " " + modelo);
	}	
}
