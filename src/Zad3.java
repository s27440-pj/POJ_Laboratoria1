import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        zad3();
    }

    public static void zad3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words separated by space: ");
        String first_word = scan.next();
        String second_word = scan.next();
        System.out.println("%" + second_word + " " + first_word + "%");
    }
}
