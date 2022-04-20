import java.util.Scanner; 

public class TabelaVerdade {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    String p, q ;
    int operacao ;

    System.out.printf("Informe a Variavel p: ");
    p = ler.next(); 

    System.out.printf("Informe a Variavel q: ");
    q = ler.next(); 

    System.out.printf("  ");
    System.out.printf("\n {Operacoes}");
    System.out.printf("   0 - Conjuncao");
    System.out.printf("   1 - Disjuncao");
    System.out.printf("   2 - Implicacao" );
    System.out.printf("   3 - Bicondicional" );
    System.out.print("\n   Escolha uma das opcoes: ");
    operacao = ler.nextInt();
    ler.nextLine();
        
         
    if (operacao == 0) {Conjuncao();
        
      System.out.printf("-");
      System.out.printf("%15s %15s %15s %n","|  " + p, "|  " + q, " | " + p +" ^ "+q);         
      System.out.printf("-----------------------");      
      System.out.printf("-----------------------");
    }
    if (operacao == 1){Disjuncao() ;
      System.out.printf("-");
      System.out.printf("%15s %15s %15s %n","|  " + p, "|  " + q, " | " + p +" v "+q);
      System.out.printf("-----------------------");
      System.out.printf("-----------------------");
    } 
    if (operacao == 2) {Implicacao();
      System.out.printf("-");
      System.out.printf("%15s %15s %15s %n","|  " + p, "|  " + q, " | " + p +" -> "+q); 
      System.out.printf("-----------------------");
      System.out.printf("-----------------------");	
    }
    if (operacao == 3) {Bicondicional();
      System.out.printf("-");
      System.out.printf("%15s %15s %15s %n","|  " + p, "|  " + q, " | " + p +" <-> "+q);  
      System.out.printf("-----------------------");
      System.out.printf("-----------------------");
    }     
  
    if (operacao >= 5) {
      System.out.printf("\n   Nao existe essa opcao !");}

    if (operacao < 0) {
      System.out.printf("\n   Nao existe essa opcao !");}
   }
        
    private static void Bicondicional() {
        String[][] table = new String[4][];
        table[0] = new String[] { "| V", "| V", "| V"};
        table[1] = new String[] { "| V", "| F", "| F"};
        table[2] = new String[] { "| F", "| V", "| F"};
        table[3] = new String[] { "| F", "| F", "| V"};

      for (String[] row : table) {
          System.out.format("%15s %15s %15s %n", row);
      }
    }

    private static void Implicacao() {
        String[][] table = new String[4][];
        table[0] = new String[] { "| V", "| V", "| V"};
        table[1] = new String[] { "| V", "| F", "| F"};
        table[2] = new String[] { "| F", "| V", "| V"};
        table[3] = new String[] { "| F", "| F", "| V"};
      for (String[] row : table) {
          System.out.format("%15s %15s %15s %n", row);
      }
    }

    private static void Disjuncao() {
        String[][] table = new String[4][];
        table[0] = new String[] { "| V", "| V", "| V"};
        table[1] = new String[] { "| V", "| F", "| V"};
        table[2] = new String[] { "| F", "| V", "| V"};
        table[3] = new String[] { "| F", "| F", "| F"};
      for (String[] row : table) {
          System.out.format("%15s %15s %15s %n", row);
      }
    }

    private static void Conjuncao() {
	   
      String[][] table = new String[4][];
      table[0] = new String[] { "| V", "| V", "| V"};
      table[1] = new String[] { "| V", "| F", "| F"};
      table[2] = new String[] { "| F", "| V", "| F"};
      table[3] = new String[] { "| F", "| F", "| F"};

      for (String[] row : table) {
          System.out.format("%15s %15s %15s %n", row);
      }
    }
    
  }