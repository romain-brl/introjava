
public class cinema2 {

    public static void main(String[] args) throws Exception {

        int p1 = 13;
        boolean adulte = true;
        boolean interdit = false;

        if (p1 > 14 && interdit == false) {
            System.out.println("entré autorisée");
        } else if (p1 > 14 && interdit == true) {
            System.out.println("entrée refusés ");
        } else if (p1 < 14 && interdit == false && adulte == true) {
            System.out.println("entré autorisée");
        } else if (p1 < 14 && interdit == true && adulte == true) {
            System.out.println("entrée refusés ");
        } else if (p1 < 14 && interdit == false && adulte == false) {
            System.out.println("entrée refusés ");
        } else if (p1 < 14 && interdit == true && adulte == false) {
            System.out.println("entrée refusés ");

        }

    }

}
