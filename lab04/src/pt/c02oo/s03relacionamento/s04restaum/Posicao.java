package pt.c02oo.s03relacionamento.s04restaum;

public class Posicao {
	boolean ocupada = false;
	int X;
	int Y;
	Tabuleiro tab;
	Peca peca;
	

	public Posicao(int X, int Y, Tabuleiro tab) {
		
		this.X = X;
		this.Y = Y;	
		this.tab = tab;
			
	}
	
	
	void conectaPeca(Peca peca) {
		
		this.peca = peca;
		ocupada = true;
		
	}
	
	
	
	void desocupa() {
		
		this.peca = null;
		ocupada = false;
		
	}
	
}
