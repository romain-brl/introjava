import java.util.Scanner;

public class M2ex2 {
    
        public static void main(String[] args) throws Exception {
            Scanner clavier = new Scanner(System.in);

                System.out.println("entrez un nombre :");     
                int nb =  clavier.nextInt();

                if (estPair(nb)) {
                    System.out.println(nb + " est pair.");
                }else {
                    System.out.println(nb +" est impaire ");
                }

                clavier.close();
          }

          static boolean estPair (int nb){
            if(nb % 2 == 0){
                return true;
            }
            else {
                return false;
            }
          } 

    
}
