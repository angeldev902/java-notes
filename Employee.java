import java.util.Scanner;

public class Employee {
  public String firstName; // private = restricted access
  public String lastName;
  public boolean isMarried;

  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }


  public Employee(String firstName, String lastName, boolean isMarried){
    this.firstName = firstName;
    this.lastName = lastName;
    this.isMarried = isMarried;
  }

  //Main method (this run when execute file)
  public static void main(String[] ars) {
    Employee angel = new Employee("Jose Angel", "Rojas Esteban", false);
    Employee lesly = new Employee("Lesly", "Hernandez", false);
    System.out.println("Hi I am "+angel.firstName);
    System.out.println("Hi I am "+lesly.firstName);
    angel.firstName = "Angel";
    System.out.println("Hi I am "+angel.firstName);

    //Use Scanner class
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter firstName");
    String firstName = myScanner.nextLine();
    System.out.println("Username is: " + firstName);

    //Level
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
};