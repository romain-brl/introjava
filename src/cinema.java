
public class cinema {

    public static int p1 = 15;
    public static boolean adulte = true;
    public static boolean interdit = false;

    public static void main(String[] args) throws Exception {

        if (autorisé(p1)) {
            System.out.println("entré autorisée");
        } else {
            System.out.println("entrée refusés ");
        }

    }

    static boolean autorisé(int p1) {
        if (p1 > 14 && interdit == false) {
            return true;
        } else if (p1 > 14 && interdit == true) {
            return false;
        } else if (p1 < 14 && interdit == false && adulte == true) {
            return true;
        } else if (p1 < 14 && interdit == true && adulte == true) {
            return false;
        } else if (p1 < 14 && interdit == false && adulte == false) {
            return false;
        } else if (p1 < 14 && interdit == true && adulte == false) {
            return false;
        }

        return false;
    }

}
