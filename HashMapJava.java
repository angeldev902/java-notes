// Import the HashMap class
import java.util.HashMap;

public class HashMapJava {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);

    // Access an Item
    System.out.println(capitalCities.get("England"));

    //Remove an Item
    capitalCities.remove("England");
    System.out.println(capitalCities);

    //Remove all elements
    //capitalCities.clear();
  }
}

