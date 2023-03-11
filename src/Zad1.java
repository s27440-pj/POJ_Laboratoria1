import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        zad1();
    }

    public static void zad1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of first side of a rectangle");
        double a = scan.nextDouble();
        System.out.println("Enter size of second side of a rectangle");
        double b = scan.nextDouble();
        double field = a * b;
        System.out.println(field);
    }
}
