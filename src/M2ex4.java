import java.util.Scanner;

public class M2ex4 {
    
    
        public static void main(String[] args) throws Exception {
            Scanner clavier = new Scanner(System.in);

            System.out.println("Quelle couleur souhaitez-vous ?");
            String couleur  =  clavier.next();

            if(couleur.equals("r") || couleur.equals("R")){
                System.out.println("ta couleur est rouge ");
            }
            else if(couleur.equals("b") || couleur.equals("B")){
                System.out.println("ta couleur est bleu ");
            }
            else if(couleur.equals("v") || couleur.equals("V")){
                System.out.println("ta couleur est Vert ");
            }else {
                System.out.println("connais pas .");
            }
            

            clavier.close();         
        }
}