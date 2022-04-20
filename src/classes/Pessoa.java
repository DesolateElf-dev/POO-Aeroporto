package classes;

public class Pessoa {
	
	private int idade;
	private double peso;
	private String nome;	
	
	
	public void existe() {
		System.out.println(nome + " está existindo...");
	}
	
	public void setPessoa(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		
		System.out.println("\nO "+nome+" acabou de nascer! Com "+idade+" anos e "+peso+ "kg");
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}	
	public double getPeso() {
		return this.peso;
	}	
	public String getNome() {
		return this.nome;
	}
}
