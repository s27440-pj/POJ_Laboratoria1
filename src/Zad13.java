import java.util.HashMap;
import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        zad13();
    }

    public static int maximum_value(int [] tab, int n){
        if (n==1) return tab[0];
        else return Math.max(tab[n-1], maximum_value(tab, n-1));
    }

    public static void zad13(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of your array: ");
        int n  =scan.nextInt();
        int [] tab = new int [n];
        System.out.println("Enter " + n + " elements of your array: ");
        for (int i=0; i<n; i++){
            tab[i] = scan.nextInt();
        }
        System.out.println(maximum_value(tab, n));
    }
}
