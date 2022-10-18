public class BinarySearch {

    public static int binaryEx(int nb, int[] vector, int low, int high) {
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (vector[middle] == nb) {
                return middle;
            }
            if (nb > vector[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int vector[] = {1, 5, 6, 9, 10, 12, 15, 16, 29};
        int nb = 11;
        int rez = binaryEx(nb, vector, 0, vector.length - 1);
        if (rez == -1) {
            System.out.println("value not found");
        } else {
            System.out.println("value found at index " + rez);
        }


    }

}
