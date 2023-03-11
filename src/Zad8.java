import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        zad8();
    }

    public static void zad8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a natural nubmer: ");
        int n = scan.nextInt();
        char sign = '*';
        char space = ' ';

        // first
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(sign);
            }
            System.out.println();
        }

        //second
        for (int i = 0; i < n; i++) {
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(sign);
            }
            System.out.println();
        }

        // third
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j >= i) System.out.print(sign);
                else System.out.print(space);
            }
            System.out.println();
        }

        // fourth
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j >= (n - i - 1)) System.out.print(sign);
                else System.out.print(space);
            }
            if (i == n-1) break;
            System.out.println();
        }
    }
}
