import java.util.Scanner;

    public class M1ex3 {

        public static void main(String[] args) throws Exception {
            Scanner clavier = new Scanner(System.in);

            
            System.out.println("entrez les heuress");
            int heure =  clavier.nextInt();
           
            while (heure > 23 || heure <0) {
                System.out.println("entrez les heuress");
                heure =  clavier.nextInt();
            }

            System.out.println("entrez les minutes");
            int minute =  clavier.nextInt();
           
            while (minute > 59 || minute <0) {
                System.out.println("entrez les minutes");
                minute =  clavier.nextInt();
            }


            System.out.println("entrez les secondes");
            int seconde = clavier.nextInt();
            
            while (seconde > 59 || seconde <0) {
                System.out.println("entrez les seconde");
                seconde =  clavier.nextInt();
            }

            int diffHeure = (24 - heure )*3600 ;
            int diffMinute = (60 - minute )*60 ;
            int diffSeconde =( 60  - seconde) *1 ; 

            int temps = diffHeure + diffMinute + diffSeconde ;
            System.out.println("il est "+ heure +" H "+minute+" min "+seconde+" s .") ;
            System.out.println("il y a  "+temps+ " seconde avant minuit");

            clavier.close();

          }
}
