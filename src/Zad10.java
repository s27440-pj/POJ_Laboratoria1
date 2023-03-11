import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        zad10();
    }

    public static void zad10(){
        System.out.println("Enter dimensions of a table, separated by space: ");
        Scanner scan = new Scanner(System.in);
        // a - number of rows, b - number of columns
        int a = scan.nextInt();
        int b = scan.nextInt();
        int num_of_elements = a*b;

        if (a < 1 || b < 1){
            System.out.println("BŁĄD");
        } else {
            double [][] table = new double [a][b];
            System.out.println("Enter elements of the table (" + num_of_elements + " elements)");
            for (int i=0; i<a; i++){
                for (int j=0; j<b; j++){
                    table[i][j] = scan.nextDouble();
                }
            }
            // printing the table
            System.out.println("This is your table: ");
            for (int i=0; i<a; i++){
                for (int j=0; j<b; j++){
                    System.out.print(table[i][j] + " ");
                }
                System.out.println();
            }
            // transposed
            System.out.println("This is your transposed table: ");
            for (int i=0; i<b; i++){
                for (int j=0; j<a; j++){
                    System.out.print(table[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
