package classes;

public class Passageiro extends Pessoa {
	
	private int codPassagem;
	private double pesoBagagem;
	private String destino;
	
	public void setPassageiro(int codPassagem, double pesoBagagem, String destino) {
		this.codPassagem = codPassagem;
		this.pesoBagagem = pesoBagagem;
		this.destino = destino;
	}
	
	public void checkIn() {
		System.out.printf("%nO passageiro %s, passagem %d com destino %s, %nacabou de fazer check-in com %.1fkg de bagagem"
				,this.getNome(), codPassagem, destino, pesoBagagem);
	}
	
	
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
