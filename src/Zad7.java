import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        zad7();
    }

    public static void zad7() {
        System.out.println("Enter number of elements in tab1 and tab 2, separated by space (they should be equal): ");
        Scanner scan = new Scanner(System.in);
        // If I enter 3 Integers the las one is being read as a value of table. How can I change it?
        int n = scan.nextInt();
        int m = scan.nextInt();

        // Doc product can be calculated only if vectors have the same size, so we can't calculate results if
        // m != n
        if (n != m || n < 1) { // no need to insert m < 1 because of the first condition
            System.out.println("BŁĄD");
        } else {
            int[] tab1 = new int[n];
            int[] tab2 = new int[m];
            System.out.println("Enter values in tab1: ");
            for (int i = 0; i < n; i++) {
                tab1[i] = scan.nextInt();
            }
            System.out.println("Enter values in tab2: ");
            for (int i = 0; i < m; i++) {
                tab2[i] = scan.nextInt();
            }

//            System.out.println("Table 1: ");
//            for (int number : tab1){
//                System.out.print(number + " ");
//            }
//            System.out.println();
//            System.out.println("Table 2:");
//            for (int number : tab2){
//                System.out.print(number + " ");
//            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += tab1[i] * tab2[i];
            }
            System.out.println("Doc products of entered tables equals " + sum);
        }
    }
}
