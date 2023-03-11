import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        zad4();
    }

    public static void zad4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of first side of triangle");
        double a = scan.nextDouble();
        System.out.println("Enter size of second side of triangle");
        double b = scan.nextDouble();
        System.out.println("Enter size of third side of triangle");
        double c = scan.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("BŁĄD");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("NIE");
        } else {
            System.out.println("TAK");
        }
    }
}
