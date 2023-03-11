import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        zad9();
    }

    public static void palindrome(String word){
        int length = word.length();
        String result = "YES";
        for (int i=0; i<length; i++){
            if (word.charAt(i) == word.charAt(length - 1 - i)) result = "YES";
            else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }

    public static void zad9(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr a word: ");
        String word = scan.next();
        String word_small_letters = word.toLowerCase();
        System.out.println("Is this word a palindrome?");
        palindrome(word_small_letters);
    }
}
