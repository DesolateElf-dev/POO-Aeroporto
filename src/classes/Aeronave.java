package classes;

public class Aeronave {
	
	private String fabricante;
	private String modelo;
	private int capacidadePassageiros;
	
	public void setAeronave(String fabricante, String modelo, int capacidadePassageiros) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		
		System.out.printf("%nA fabricante %s acaba de lançar uma nova aeronave!", fabricante);
		System.out.printf("%nO modelo %s possui capacidade de %d passageiros", modelo, capacidadePassageiros);
	}
	
	public void decolando() {
		System.out.printf("A aeronave %s está decolando", modelo);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}

	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}	

}
