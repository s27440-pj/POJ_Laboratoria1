import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        zad6();
    }

    public static void zad6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number separated by space: ");

        double[] table = new double[3];
        for (int i = 0; i < 3; i++) {
            table[i] = scan.nextDouble();
        }

        // Buble sorting - we need two loops. Ex. for 3 2 1 the inside loop will move number to positions 2 1 3 -
        // It will check if number 3 is in the right position.
        // The outside loop will make this loop go second time, and check if 2 is in the right position (it will
        // first compare 2 with 1, and next 2 with 3)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double max = table[j];
                if (table[j + 1] < table[j]) {
                    table[j] = table[j + 1];
                    table[j + 1] = max;
                }
            }
        }

        System.out.println("Ascending: ");
        for (double number : table) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Descending: ");
        for (int i = 2; i >= 0; i--) {
            System.out.print(table[i] + " ");
        }
    }
}
