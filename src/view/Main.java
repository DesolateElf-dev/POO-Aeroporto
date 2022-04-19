package view;

import classes.Passageiro;
import classes.Piloto;

public class Main {

	public static void main(String[] args) {
		
		//Piloto piloto1 = new Piloto();
		
		//piloto1.setPessoa("João", 34, 75.3);
		
		Passageiro passageiro1 = new Passageiro();
		
		passageiro1.setPessoa("Carlos", 27, 84.5);
		
		passageiro1.setPassageiro(20221804, 62.3, "São Paulo");	
		
		passageiro1.checkIn();
		
	}

}


/**
Criar exercício de dependência sobre Aeroporto, 
fazendo os relacionamentos que julgar necessário com as entidades abaixo:
- Aeronave
- Pessoa
- Piloto
- Passageiro
- Aeroporto

1.Desenhe o diagrama de classe dessas entidades, 
especificando as associações entre elas. 
Cada classe deve conter pelo menos 3 características e ao menos 1 comportamento, 
não se esqueça de fazer também a herança.

2.Escreva o código em Java das classes

3.Crie uma função main que instancie ao menos 2 instâncias de cada classe, 
preenchendo as associações.
**/