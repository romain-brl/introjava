import java.util.Scanner;

public class M2ex5 {
           
    
        public static void main(String[] args) throws Exception {
            Scanner clavier = new Scanner(System.in);

            boolean valeur = false ;
            
            System.out.println("donnez un mot ?");
            String capitale  =  clavier.next();

            int taille = capitale.length();
            
            for(int i =0 ; i <= taille; i++ ){               
               if(i==0){
                    char charUn = capitale.charAt(i);            
                    if (Character.isUpperCase(charUn)){
                        valeur = true;
                    }
                    break;
                }
            }
            System.out.println(valeur);
           
           
           
            clavier.close();
        }
}
