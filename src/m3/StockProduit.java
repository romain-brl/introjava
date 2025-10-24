package m3;

import java.util.Scanner;

public class StockProduit {

    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Quel est le stock initial ? ");
        int initial = clavier.nextInt();

        System.out.print("Quel est le seuil d'alerte ? ");
        int seuil = clavier.nextInt();

        System.out.print("Combien de jour doit durer la simulation ? ");
        int durer = clavier.nextInt();

        int y = 0;

        for (int i = 0; i < durer; i++) {

            y = y + 1;
            System.out.println("");
            System.out.println("jour " + y);
            System.out.println("------");

            System.out.print("Quantité de produit recue ? ");
            int recu = clavier.nextInt();

            initial = initial + recu;

            System.out.print("Quantité de produit vendue ? ");
            int vendue = clavier.nextInt();

            initial = initial - vendue;

            System.out.println("Le stock actuel est de : " + initial);
            System.out.println("");

            if (initial <= seuil && initial >= 0) {
                System.err.println("ATTENTION : le stock est sous le seuil d'alerte");
            }
            if (initial < 0) {
                System.out.println("ERREUR : le stock est négatif. Simulation arrêté.");
                break;
            }
        }

        clavier.close();

    }
}
