
public class Carro {
	
	public String fabricante = "VW";
	public String modelo = "Gol";
	
	public void receberDados(String nomeFabricante, String modeloFabricante) {
		fabricante = nomeFabricante;
		modelo = modeloFabricante;
	}
	
	public void mostrarDados() {
		System.out.println("Dados do carro: " + fabricante + " " + modelo);
	}
}