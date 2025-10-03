public class M2ex7 {

    public static void main(String[] args) throws Exception {

        int nbImp = nbImapire(5, 9, 13);
        System.out.println(nbImp);
    }

    static int nbImapire(int nb1, int nb2, int nb3) {
        int nbImp = 0;
        if (nb1 % 2 != 0) {
            nbImp = nbImp + 1;
        }
        if (nb2 % 2 != 0) {
            nbImp = nbImp + 1;
        }
        if (nb3 % 2 != 0) {
            nbImp = nbImp + 1;
        }
        return nbImp;
    }

}
