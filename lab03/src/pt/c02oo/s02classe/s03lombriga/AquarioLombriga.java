package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga{
    int tamAquario;
    int posicaoCabeca;
    int tamLombriga;
    String lado;



    public AquarioLombriga(int tamAquario, int tamLombriga, String lado) {

        this.tamAquario = tamAquario;
        this.tamLombriga =  tamLombriga;
        this.lado = lado;

    }

    public void crescer(){

        if(lado.equals("esquerda") && (posicaoCabeca + tamLombriga - 1 < tamAquario)){

        	tamLombriga += 1;

        }	else if(lado.equals("direita") && (posicaoCabeca - tamLombriga > 0)) {
        	
        	tamLombriga += 1;        	
        	
        	
        }


    }



}
