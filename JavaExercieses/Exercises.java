import java.util.Scanner;

public class Exercises {

    public static void positiveOrNegative(float a) {
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a == 0) {
            System.out.println("Number = 0");
        } else {
            System.out.println("Nr < 0");
        }
    }

    public static void ex2A() {
        for (int i = 10; i <= 20; i += 2) {
            if (i == 16) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void ex2B() {
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 16) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    public static void ex2C() {
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 16) {
                    continue;
                } else if (i == 20) {
                    break;
                }
                System.out.println(i);
            }
        }
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("a: " + a);
        } else if (b > c) {
            System.out.println("b: " + b);
        } else {
            System.out.println("c: " + c);
        }
    }

    public static void ex4() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        positiveOrNegative(5);
        ex2A();
        ex2B();
        ex2C();
        ex3();
        ex4();
    }
}
