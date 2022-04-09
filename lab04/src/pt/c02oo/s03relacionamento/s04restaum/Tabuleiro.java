package pt.c02oo.s03relacionamento.s04restaum;
import java.lang.Math;

public class Tabuleiro {

	 Posicao[][] posicoes = new Posicao[7][7];
	 
	 
	public Tabuleiro() {
		
		for(int i=0; i < 7; i++) {
			posicoes[i] = new Posicao[7];
			
			
			for(int j=0; j < 7; j++) {
				
				posicoes[i][j] = new Posicao(i, j, this);
				
				posicoes[i][j]
						.conectaPeca(new Peca(posicoes[i][j]));
				
						
			}	
		}
		
		posicoes[3][3].desocupa();
		
		
		
		
		for(int i=0; i < 7; i++) {
			posicoes[2][i].ocupada  = true;
			posicoes[i][2].ocupada = true;
			
			posicoes[3][i].ocupada  = true;
			posicoes[i][3].ocupada = true;
			
			posicoes[4][i].ocupada  = true;
			posicoes[i][4].ocupada = true;
			
		}
		
		posicoes[3][3].ocupada = false;
		
	}
	
	char[][] apresenta() {
		
		char[][] representacao = new char[7][7];
		
		for(int i=0; i < 7; i++) {
			
			for(int j=0; j < 7; j++) {
				representacao[i][j] = '-';
				
				if(posicoes[i][j].ocupada == true) {
					
					representacao[i][j] = 'P';
					
				}
			}
		}
		
		return representacao;
		
	}
	
	void move(String movimento) {
		
		
		int ySaida = movimento.charAt(0) - 'a';
		int xSaida = movimento.charAt(1) - '1';
		
		int yChegada = movimento.charAt(3) - 'a';
		int xChegada = movimento.charAt(4) - '1';
		
		int difX = xSaida - xChegada;
		int difY = ySaida - yChegada;
		
		int xComida;
		int yComida;
		
		
		if((difX != 0 
				&& difY != 0) || (xChegada > 7 || yChegada > 7
						|| xSaida > 7 || ySaida > 7)) {
			
			System.out.println("Movimento impossivel");
			return;
			
		}
		
		
		if(Math.pow(difX/2, 2) == 1) {
			
			xComida = (xSaida + xChegada)/2;
			yComida = ySaida;
			
				
		}
		
		else if(Math.pow(difY/2, 2) == 1) {
			
			
			yComida	= (ySaida + yChegada)/2;	
			xComida = xSaida;
			
			
			
		}
		
		else {
			
			System.out.println("Movimento impossivel");
			return;
			
			
		}
		
		
		Posicao posSaida = posicoes[xSaida][ySaida];
		Posicao posChegada = posicoes[xChegada][yChegada];
		Posicao posComida = posicoes[xComida][yComida];
		
		
		
		
		if(posSaida.ocupada == true 
				&& posChegada.ocupada == false
				&& posComida.ocupada == true) {
			
			
			posSaida.peca.come(posComida.peca);
			posSaida.peca.move(posChegada);
			
			return;
			
		}
		
		
		
		
		
		
	}

}
