package classes;

public class Passageiro extends Pessoa {
	
	private int codPassagem;
	private double pesoBagagem;
	private String destino;
	
	
	
	
	
	public int getCodPassagem() {
		return codPassagem;
	}
	public void setCodPassagem(int codPassagem) {
		this.codPassagem = codPassagem;
	}
	public double getPesoBagagem() {
		return pesoBagagem;
	}
	public void setPesoBagagem(double pesoBagagem) {
		this.pesoBagagem = pesoBagagem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

}
