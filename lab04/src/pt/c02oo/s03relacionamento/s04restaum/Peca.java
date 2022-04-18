package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
	Posicao posicao;
	boolean viva = true;
	public Peca(Posicao posicao) {
		
		this.posicao = posicao;
		
			
	}
	
		
	void comer(Peca peca, Posicao nova) {
		
		
		if(peca.viva) {
						
			peca.morre();
			
		}

		this.desocupaPosicao();
		this.posicao = nova;
		
		nova.conectaPeca(this);

	}
	
	
	
	
	void morre() {
		
		viva = false;
		desocupaPosicao();
		
	}
	
	
	
	void desocupaPosicao() {
		
		this.posicao.desocupa();
		
	}
	
	

}
