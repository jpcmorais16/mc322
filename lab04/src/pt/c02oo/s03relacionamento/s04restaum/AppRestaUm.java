package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
	   
	   
	   
	    
	   
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      
      Tabuleiro tab = new Tabuleiro();
      tk.writeBoard("Tabuleiro", tab.apresenta());
      
      
          
    
      String commands[] = tk.retrieveCommands();
      
      
      
      for (int l = 0; l < commands.length; l++) {
         System.out.println(commands[l]);
         
         tab.move(commands[l]);
         
         tk.writeBoard("Tabuleiro", tab.apresenta());
         
      }
           
      
      
            
   
      
      tk.stop();
   }

}
