
public class Principal {

	public static void main(String[] args) {
		
		Grafico grafico1 = new Grafico('*', false);

		Grafico grafico2 = new Grafico('#', true);
		
		SegundoGrau plotagem = new SegundoGrau(-10, 10);
		
		plotagem.conecta(grafico1);
		plotagem.apresenta();
		
		plotagem.conecta(grafico2);
		plotagem.apresenta();
		
	}

}
