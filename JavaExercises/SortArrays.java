import java.util.Scanner;

public class SortArrays {

    static void sortArr() {
        int v[] = new int[10];
        int a, b;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            v[i] = scanner.nextInt();
        }
        for (int i = 0; i < (v.length); i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    a = v[j];
                    b = v[i];
                    v[i] = a;
                    v[j] = b;
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    static void checkNo(int v[], int nr) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == nr) {
                System.out.println("Nr " + nr);
                break;
            }
        }
    }

    static boolean checkNo1(int v[], int nr) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == nr) {
                return true;
            }
        }
        return false;
    }

    static void checkMin(int v[]) {
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
        }
        System.out.println("Min: " + min);
    }

    static void checkMax(int v[]) {
        int max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        System.out.println("Max: " + max);
    }

    static void reverseArray(int v[]) {
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.println(v[i]);
        }
    }

    static void findDuplicates(int v[]) {
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    System.out.println("E: " + v[i] + " is duplicate");
                }
            }
        }
    }

    public static void main(String[] args) {
        sortArr();
        int nrV[] = {55, 88, 79, 10, 25, 23, 25, 55};
        checkNo(nrV, 5); //false
        System.out.println(checkNo1(nrV, 5));  //false
        checkMin(nrV); // Min: 10
        checkMax(nrV);  // Max: 88
        reverseArray(nrV);
        findDuplicates(nrV); // E: 55/25 duplicate
    }

}
