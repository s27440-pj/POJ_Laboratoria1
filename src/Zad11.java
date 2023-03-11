import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        zad11();
    }

    public static void panagram(String sentence){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // To omit the problem of big and small letters I convert it all to small letters.
        String sentence_small_letters = sentence.toLowerCase();
        char[] letters_in_sentence = sentence_small_letters.toCharArray();
        for (char letter : letters_in_sentence){
            System.out.print(letter + " ");
        }
        System.out.println();

        boolean is_letter = false;
        for (char letter : alphabet){
            is_letter = false;
            for (char letter_2 : letters_in_sentence) {
                if (letter == letter_2) {
                    is_letter = true;
                    // if it finds the letter - no need to continue searching
                    break;
                }
            }
            if (!is_letter){
                System.out.println("False! There is no letter " + letter + " in this sentence (and maybe others, " +
                        "but " + letter + " for sure).");
                // if it finds, that at least one letter hasn't been found - to need to continue searching
                break;
            }
        }
        if (is_letter) System.out.println("True! It's a panagram!");

    }

    public static void zad11(){
        System.out.println("Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        panagram(sentence);
    }
}
