public class Fibonacci {

    public static void fibo(int nr) {
        int nr1 = 0;
        int nr2 = 1;
        System.out.println(nr1);
        System.out.println(nr2);
        for (int i = 2; i <= nr; i++) {
            int sum = nr1 + nr2;
            nr1 = nr2;
            nr2 = sum;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        fibo(10);
    }

}
