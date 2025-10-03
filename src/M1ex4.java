import java.util.Scanner;

    public class M1ex4 {

        public static void main(String[] args) throws Exception {
            Scanner clavier = new Scanner(System.in);

            
            System.out.println("entrez les heures");
            int heure =  clavier.nextInt();
           
            while (heure > 23 || heure <0) {
                System.out.println("entrez les heures");
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

            heure = heure * 3600;
            minute = minute * 60;
            seconde = seconde *1;

            

            int temps = heure + minute + seconde ;

            float P = temps * 100 / 86400 ;

            System.out.println("il y a  "+ P + " % depuis minuit");

            clavier.close();

          }
}
