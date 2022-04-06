package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
	
	String stringAnimacao;
	int estagioAnimacao = 6;
	AquarioLombriga lomb ;
	boolean iniciou = false;

	public Animacao(String stringAnimacao) {
		String aux1 = "";
		String aux2 = "";
		String aux3 = "";
		
		
		this.stringAnimacao = stringAnimacao;
		
		aux1 += stringAnimacao.charAt(0);
		aux1 += stringAnimacao.charAt(1);
		
		int AA = Integer.parseInt(aux1);
		
		aux2 += stringAnimacao.charAt(2);
		aux2 += stringAnimacao.charAt(3);
	 
		int LL = Integer.parseInt(aux2);
		
		aux3 += stringAnimacao.charAt(4);
		aux3 += stringAnimacao.charAt(5);
		
		int PP = Integer.parseInt(aux3);
		
		
		lomb = new AquarioLombriga(AA, LL, "esquerda", PP);
		
		
		
	}
	
	public void passo() {
		
		if(lomb.iniciada == false) {
			lomb.iniciar();
			return;
		}
		
		
		try{
			if(stringAnimacao.charAt(estagioAnimacao) == 'C') 
				lomb.crescer();
				
			else if(stringAnimacao.charAt(estagioAnimacao) == 'M')
				lomb.mover();
			
			else
				lomb.virar();
				
			estagioAnimacao += 1;
		}
		
		catch(Exception e){}
		
			return;
		
		}
		
	public String apresenta() {
		
		
		return lomb.apresenta();
			
		
	}
		
		
		
		
	
	
	

}
