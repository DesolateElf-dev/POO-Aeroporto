package view;

import classes.Passageiro;
import classes.Piloto;
import controller.Aeroporto;

public class Main {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto();
		piloto1.setPessoa("Jo?o", 34, 75.3);
		piloto1.setPiloto("Noite", 2000, "Comercial");
		piloto1.pilotando();
		
		
		Passageiro passageiro1 = new Passageiro();
		passageiro1.setPessoa("Carlos", 27, 84.5);
		passageiro1.setPassageiro(20221804, 62.3, "S?o Paulo");		
		passageiro1.checkIn();
		
		Aeroporto aeroporto1 = new Aeroporto();	
		aeroporto1.setAeroporto("Gale?o", 1500, 20);
		aeroporto1.aeronavesNaFila();
				
	}

}


/**
Criar exerc?cio de depend?ncia sobre Aeroporto, 
fazendo os relacionamentos que julgar necess?rio com as entidades abaixo:
- Aeronave
- Pessoa
- Piloto
- Passageiro
- Aeroporto

1.Desenhe o diagrama de classe dessas entidades, 
especificando as associa??es entre elas. 
Cada classe deve conter pelo menos 3 caracter?sticas e ao menos 1 comportamento, 
n?o se esque?a de fazer tamb?m a heran?a.

2.Escreva o c?digo em Java das classes

3.Crie uma fun??o main que instancie ao menos 2 inst?ncias de cada classe, 
preenchendo as associa??es.
**/