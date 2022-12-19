public class Start {
    public static void main(String[] args) {

        boolean A = (55 != 55) && (false ^ true);
        System.out.println(A);


        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';

        boolean result = (!a || !b) || c == d;
        System.out.println(result);

        boolean C = false && true || false && !false;
        System.out.println(C);


        boolean D = (false && true) || (false || true);
        System.out.println(D);



    }
}
