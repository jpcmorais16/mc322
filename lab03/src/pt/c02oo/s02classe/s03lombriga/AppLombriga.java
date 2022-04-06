package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      for (int l = 0; l < lombrigas.length; l++) {
    	  
         Animacao anima = new Animacao(lombrigas[l]);
         
         for(int i=0; i < lombrigas[l].length() - 4; i++) {
        	 
        	 tk.gravaPasso(anima.apresenta());
        	 
        	 anima.passo();
        	 
        	 
         }
      
         
      }
      
      
 
      tk.stop();
   }
	
	
	/*public static void main(String[] args) {
		
		
		Animacao anima = new Animacao("080403MCMVM");
		
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		anima.passo();
		System.out.println(anima.apresenta());
		
		
		
		
	}*/

}
