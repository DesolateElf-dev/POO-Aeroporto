package classes;

public class Piloto extends Pessoa {
	
	private String turnoPiloto;
	private int tempoDeVoo;
	private String categoriaPiloto;
	
		
	public void pilotando() {
		System.out.printf("O piloto %s está pilotando...%n", this.getNome());
	}
	
	public void setPiloto(String turnoPiloto, int tempoDeVoo, String categoriaPiloto) {
		this.turnoPiloto = turnoPiloto;
		this.tempoDeVoo = tempoDeVoo;
		this.turnoPiloto = turnoPiloto;
	}
	
	public String getTurnoPiloto() {
		return turnoPiloto;
	}
	public void setTurnoPiloto(String turnoPiloto) {
		this.turnoPiloto = turnoPiloto;
	}
	public int getTempoDeVoo() {
		return tempoDeVoo;
	}
	public void setTempoDeVoo(int tempoDeVoo) {
		this.tempoDeVoo = tempoDeVoo;
	}
	public String getCategoriaDePilotagem() {
		return categoriaPiloto;
	}
	public void setCategoriaDePilotagem(String categoriaPiloto) {
		this.categoriaPiloto = categoriaPiloto;
	}	
	
}