public class DoWhileEx {

    public static void sumOfNNr(int nr) {
        int sum = 0, i = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= nr);
        System.out.println(sum);
    }

    public static void first20EvenNr() {
        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);
    }

    public static void main(String[] args) {

        sumOfNNr(100);
        first20EvenNr();

    }

}
