public class Factorial {

    public static int factorialNr(int nr) {
        int fac = 1;
        if (nr == 0) {
            return 1;
        } else if (nr < 0) {
            return 0;
        } else {
            for (int i = 1; i <= nr; i++) {
                fac = fac * i;
            }
            return fac;
        }
    }

    public static long factNr(int n) {
        if (n >= 1) {
            return n * factNr(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorialNr(5));
        System.out.println(factNr(5));

    }

}
