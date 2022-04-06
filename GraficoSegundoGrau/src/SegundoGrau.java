
public class SegundoGrau {
	int valorInicial, valorFinal, nTermos;
	Grafico saida;

	public SegundoGrau(int valorInicial, int valorFinal) {
		
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		
			
	}
	
	void conecta(Grafico saida) {
		
		this.saida = saida;
		
	}
	
	void apresenta() {
		
		if(saida != null) {
			
			
			for(int i=valorInicial; i <= valorFinal; i++) {
			
				saida.plota(i * i);
				
				
				
			}
			
			
		}
		
		
		
	}
	

}
