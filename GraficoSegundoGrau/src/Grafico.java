
public class Grafico {
	char caractere;
	boolean preenchido;
	
	public Grafico( char caractere, boolean preenchido) {
		this.preenchido = preenchido;
		this.caractere = caractere;
	}

	
	
	void plota(int y) {
		String linha = "";
		
		if(preenchido) {
			for(int i=0; i < y; i++) {
	
				linha += caractere;
				
			}
			
			System.out.println(linha);
			return;
		
		}
		
		for(int i=0; i < y; i++) {
			
			if(i == y-1)
				linha += caractere;
			
			linha += " ";
	
		}
		System.out.println(linha);
		
	}
	
}
