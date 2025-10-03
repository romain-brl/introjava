import java.util.Scanner;

public class M2ex1 {
    public static void main(String[] args) throws Exception {

        Scanner clavier = new Scanner(System.in);

        System.out.println("entrez un nombre ");
        int nb = clavier.nextInt();

        if (nb % 2 == 0) {
            System.out.println(nb + " est pair.");
        } else {
            System.out.println(nb + " est impaire.");
        }
        clavier.close();

    }
}
