import java.util.Scanner;

public class M2ex6{
            public static void main(String[] args) throws Exception {
                
                Scanner clavier = new Scanner(System.in);

                    System.out.println("entrez un String ");                
                    String phrase =  clavier.nextLine();

                    int nbLettre = 0;

                    
                for ( int i=0; i < phrase.length() ; i++ ){
                    
                    char c = phrase.charAt(i);
                   
                    if( Character.isLetter(c) ){
                        nbLettre = nbLettre +1 ;
                    }


                } 
                System.out.println(nbLettre);

            }
}   


