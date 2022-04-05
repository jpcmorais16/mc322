package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga{
    int tamAquario;
    int posicaoCabeca;
    int tamLombriga;
    int posicaoFim;
    String lado;



    public AquarioLombriga(int tamAquario, int tamLombriga, String lado, int posicaoCabeca) {

        this.tamAquario = tamAquario;
        this.tamLombriga =  tamLombriga;
        this.lado = lado;
        this.posicaoCabeca = posicaoCabeca;
        if(lado.equals("esquerda")) {
        	
        	posicaoFim = posicaoCabeca + tamLombriga - 1;
        	return;
        	
        }
        
        posicaoFim = posicaoCabeca - tamLombriga + 1;
        
        

    }
    
    public String apresenta() {
    	
    	String desenho = "";
    	
    	for(int i=1; i <= tamAquario; i++) {
    		
    		
    		if(i == posicaoCabeca) {
    			desenho += 'O';
    			
    		}
    			
    		else if((posicaoCabeca < i && i <= posicaoFim) || (posicaoCabeca > i && i >= posicaoFim)) {
    			
    			desenho += '@';
    			
    		}
    		
    		else {
    			
    			desenho += '#';
    				    			
    		}
    		
    	}
    	return desenho;
    		
     	
    }
    
    

    public void crescer(){

        if(lado.equals("esquerda") && (posicaoCabeca + tamLombriga - 1 < tamAquario)){

        	tamLombriga += 1;
        	posicaoFim += 1;

        }	else if(lado.equals("direita") && (posicaoCabeca - tamLombriga > 0)) {
        	
        	tamLombriga += 1;
        	posicaoFim -= 1;
        	
        	
        }


    }
    
    public void mover() {
    	
    	if(lado.equals("esquerda")) {
    		posicaoCabeca -= 1;
    		posicaoFim -= 1;
    		return;
    		
    		
    	}
    	posicaoCabeca += 1;
    	posicaoFim += 1;
    	
    	
    }
    
    public void virar() {
    	int aux = posicaoCabeca;
    	
    	posicaoCabeca = posicaoFim;
    	posicaoFim = aux;
    	
    	if(lado.equals("esquerda")) {
    		lado = "direita";
    		return;
    		
    		
    	}
    	lado = "esquerda";
    	
    	
    	
    }
    
    



}
