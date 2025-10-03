import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner clavier = new Scanner(System.in);

        System.out.println("entrer un premier nom : ");
        String nomUn = clavier.next().trim();

        System.out.println("entrer un nombre :");
        int nb = clavier.nextInt();

        System.out.println("entrer un deuxieme nom");
        String nomDeux = clavier.next().trim();

        System.out.println("entrer un adjectif nom");
        String adj = clavier.next().trim();

        
        System.out.println("il était une fois un "+ nomUn + " qui avait "+ nb + nomDeux +". Cela le rendait très"+ adj );
    }
}
