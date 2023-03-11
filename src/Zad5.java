import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        zad5();
    }

    public static void zad5() {
        // be carefull! Only works with JDK 17
        System.out.println("Enter a number from 1 to 12: ");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month) {
            case 1 -> System.out.println("Januray: 21 days");
            case 2 -> System.out.println("February: 28/29 days");
            case 3 -> System.out.println("March: 31 days");
            case 4 -> System.out.println("April: 30 days");
            case 5 -> System.out.println("May: 31 days");
            case 6 -> System.out.println("June: 30 days");
            case 7 -> System.out.println("July: 31 days");
            case 8 -> System.out.println("August: 31 days");
            case 9 -> System.out.println("September: 30 days");
            case 10 -> System.out.println("October: 31 days");
            case 11 -> System.out.println("November: 30 days");
            case 12 -> System.out.println("December: 31 days");
            default -> System.out.println("BŁAD");
        }
    }
}
