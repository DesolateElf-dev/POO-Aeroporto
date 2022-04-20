package controller;

import classes.Aeronave;

public class Aeroporto extends Aeronave{
	
	private String nomeAeroporto;
	private int capacidadeAeronaves;
	private int capacidadePessoas;
	
	public void setAeroporto(String nomeAeroporto, int capacidadeAeronaves, int capacidadePessoas) {
		this.nomeAeroporto = nomeAeroporto;
		this.capacidadeAeronaves = capacidadeAeronaves;
		this.capacidadePessoas = capacidadePessoas;
		
		System.out.println("\nUm novo aeroporto acaba de ser construído!");
		System.out.printf("Seu nome é %s, possui capacidade de %d pessoas e %d aeronaves",nomeAeroporto, capacidadeAeronaves, capacidadePessoas);
	}
	
	public void aeronavesNaFila() {
		
		int aeronaves = aleatorioEntre(0,20);
		
		System.out.printf("%nExistem %d aeronaves esperando no %s para decolar", aeronaves, nomeAeroporto);
	}

	public String getNomeAeroporto() {
		return nomeAeroporto;
	}

	public void setNomeAeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}

	public int getCapacidadeAeronaves() {
		return capacidadeAeronaves;
	}

	public void setCapacidadeAeronaves(int capacidadeAeronaves) {
		this.capacidadeAeronaves = capacidadeAeronaves;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	
	private int aleatorioEntre(int inicio, int fim) {
		
		fim = fim-inicio;
		fim++;

		int numero = (int)((Math.random()*fim)+inicio);
		
		return numero;
	}
}
