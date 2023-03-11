import java.util.HashMap;
import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        zad12();
    }

    public static void Age_on_planet(long age_in_seconds, String planet){
        double days_Ziemia = 365.25;
        int seconds_in_day = 86400;
        HashMap<String, Double> planets = new HashMap<>();
        planets.put("Ziemia", days_Ziemia * seconds_in_day);
        planets.put("Merkury", days_Ziemia * 0.2408467 * seconds_in_day);
        planets.put("Wenus", days_Ziemia * 0.61519726 * seconds_in_day);
        planets.put("Mars", days_Ziemia * 1.8808158 * seconds_in_day);
        planets.put("Jowisz", days_Ziemia * 11.862615 * seconds_in_day);
        planets.put("Saturn", days_Ziemia * 29.447498 * seconds_in_day);
        planets.put("Uran", days_Ziemia * 84.016846 * seconds_in_day);
        planets.put("Neptun", days_Ziemia * 164.79132 * seconds_in_day);
        if (planet.equals("Ziemia") || planet.equals("Merkury") || planet.equals("Wenus") ||
                planet.equals("Mars") || planet.equals("Jowisz") || planet.equals("Saturn") ||
                planet.equals("Uran") || planet.equals("Neptun")){
            double age_on_planet = age_in_seconds / (planets.get(planet));
            System.out.format("%.2f%n",age_on_planet);
        } else {
            System.out.println("BŁĄD");
        }
    }

    public static void zad12(){
        System.out.println("Enter age in seconds: ");
        Scanner scan = new Scanner(System.in);
        long age_in_seconds = scan.nextLong();
        System.out.println("Enter a planet (in polish, starting with a BIG letter): ");
        String planet = scan.next();
        Age_on_planet(age_in_seconds, planet);
    }
}
