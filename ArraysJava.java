import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class ArraysJava {
    public static void main(String[] ars){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

        System.out.println(cars);

        // Access an Item
        System.out.println(cars.get(0));

        //Change an Item
        cars.set(0, "Opel");
        System.out.println(cars);

        //Remove an Item
        cars.remove(2);
        System.out.println(cars);

        //ArrayList Size
        System.out.println(cars.size());

        //Loop throught
        cars.add("Mustang");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        };

        for (String car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
          System.out.println(i);
        }

        Collections.sort(cars, Collections.reverseOrder()); // Sort myNumbers

        for (String i : cars) {
          System.out.println(i);
        }
    }
}