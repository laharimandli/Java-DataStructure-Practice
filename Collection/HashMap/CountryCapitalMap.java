import java.util.HashMap;
import java.util.Scanner;
public class CountryCapitalMap {
    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        countryCapital.put("India", "New Delhi");
        countryCapital.put("USA", "Washington D.C.");
        countryCapital.put("Japan", "Tokyo");
        countryCapital.put("France", "Paris");
        System.out.print("Enter a country to find its capital: ");
        String country = sc.nextLine();
        if (countryCapital.containsKey(country)) {
            System.out.println("Capital of " + country + " is " + countryCapital.get(country));
        } else {
            System.out.println("Country not found in the map.");
        }
        System.out.println("\nCountry-Capital List:");
        for (String c : countryCapital.keySet()) {
            System.out.println(c + " -> " + countryCapital.get(c));
        }
    }
}
