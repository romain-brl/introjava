import java.util.Scanner;

public class M2ex3 {
    

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Combien va dépenser Fred ? ");
        int montant = console.nextInt();
        System.out.println();
        int nbBillets1 = montant / 20;
        if (nbBillets1 * 20 < montant) {
            nbBillets1++;
        }

        System.out.print("Combien va dépenser Cathy ? ");
        montant = console.nextInt();
        System.out.println();
        int nbBillets2 = montant / 20;
        if (nbBillets2 * 20 < montant) {
            nbBillets2++;
        }

        console.close();
        System.out.println("Fred aura besoin de " + nbBillets1 + " billets de 20.");
        System.out.println("Cathy aura besoin de " + nbBillets2 + " billets de 20.");
    }

    static int nbb ( int nbBillets2, int nbBillets1  ){
        

        return 0;
    }
}
