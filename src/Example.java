public class Example {

    public static int ex2(int nr) {
        int rez = 1;
        for (int i = 0; i <= nr; i++) {
            if (i == 0) {
                i++;
            }
            rez = rez * i;
        }
        return rez;
    }

    public static void ex3(int a, int b, int c) {
        boolean rez = false;
        int sum = a + b;
        if (sum == c) {
            rez = true;
        }
        System.out.println(rez);
    }

    public static void main(String[] args) {
        System.out.println(ex2(4));
        ex3(2, 3, 6);
    }

}
