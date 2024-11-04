public class Main {
  String className = "I am object";
  /**
   * Java Methods
   * A method is a block of code which only runs when it is called.
   * You can pass data, known as parameters, into a method.
   * Methods are used to perform certain actions, and they are also known as functions.
   */
  // static means that the method belongs to the Main class and not an object of the Main class.
  // void means that this method does not have a return value.
  static void myMethod(String name) { // This a method
    // code to be executed
    System.out.println("Hi I am method "+name);
  };

  static int addition(int numberOne, int numberTwo){
    return numberOne + numberTwo;
  }

  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("This is my first java program");
    System.out.println(5 * 5);
    //This is a comment
    /**
     * Comment in 
     * Multiples lines
     */

    // Vars
    String name = "Jose Angel Rojas Esteban";
    int age = 28;
    double amount = 1000000.9235645645665456456d, price2 = 20.00d;
    char letter = 'a';
    boolean isMarried = false;
    final float price = 5.997887f;
    System.out.println(name);
    System.out.println(age);
    System.out.println(amount);
    System.out.println(letter);
    System.out.println(isMarried);
    System.out.println(price);
    System.out.println(price2);
    //--------------String Methods
    // length
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length()); 
    //toUpperCase() and toLowerCase():
    String msj = "Hello World";
    System.out.println(msj.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(msj.toLowerCase());   // Outputs "hello world"
    // Finding a Character in a String
    String txtFinded = "Please locate where 'locate' occurs!";
    System.out.println(txtFinded.indexOf("locate")); // Outputs 7
    // String Concatenation
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName + " " + lastName);
    System.out.println(firstName.concat(lastName));
    //-----------------------Math 
    int maxNumber = Math.max(5, 10); // Return max number
    System.out.println(maxNumber);
    int minNumber = Math.min(5, 10); // Return min number
    System.out.println(minNumber);
    double sqrtNumber = Math.sqrt(64); // method returns the square root of x:
    System.out.println(sqrtNumber);
    double absoluteValue = Math.abs(-4.7);
    System.out.println(absoluteValue);
    int randomNum = (int)(Math.random() * 101);
    System.out.println(randomNum);
    //-----------------------If.........else
    int number1 = 200, number2 = 300;
    if (number1 > number2) {
        // block of code to be executed if condition1 is true
        System.out.println("number1 is bigger");
    } else if (number1 < number2) {
      // block of code to be executed if the condition1 is false and condition2 is true
       System.out.println("number1 is smaller");
    } else {
      // block of code to be executed if the condition1 is false and condition2 is false
      System.out.println("number1 is equal to number2");
    };
    //------------------------Short Hand if...else
    // which is known as the ternary operator
    // variable = (condition) ? expressionTrue :  expressionFalse;
    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
    //--------------------------Switch
    int day = 4;
    switch (day) {
     case 1:
       System.out.println("Monday");
       break;
     case 2:
       System.out.println("Tuesday");
       break;
     case 3:
       System.out.println("Wednesday");
       break;
     case 4:
       System.out.println("Thursday");
       break;
     case 5:
       System.out.println("Friday");
       break;
     case 6:
       System.out.println("Saturday");
       break;
     case 7:
       System.out.println("Sunday");
       break;
     };
    // -------------------------While
    // The while loop loops through a block of code as long as a specified condition is true
    int numberWhile = 0;
    while (numberWhile < 5) {
        System.out.println(numberWhile);
        numberWhile++;
    };
    // ------------------------Do/While Loop
    int i = 0;
    /**
     * The do/while loop is a variant of the while loop. 
     * This loop will execute the code block once, before checking if the condition is true, then it will 
     * repeat the loop as long as the condition is true.
     */
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);
    //----------------------------Java For Loop
    for (int numberI = 0; numberI < 3; numberI++) {
      System.out.println(numberI);
    };
    //----------------------------For-Each Loop
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // This is an array
    for (String car : cars) {
      if(car == "Ford"){
        continue;
      };
      System.out.println(car);
    };
    //----------------------------Java Arrays
    // Use {} rather []
    int[] myNum = {10, 20, 30, 40}; 
    cars[0] = "Opel";
    System.out.println(cars[0]);
    //Call method
    myMethod("Angel");
    // Addition result
    int additionResult = addition(15, 28);
    System.out.println(additionResult);
    //--------------------------Recursion
    int recursionResult = sum(10);
    System.out.println(recursionResult);
    //---------------------------Object
    Main myObj = new Main();
    System.out.println("Hi I am object "+myObj.className);
  };

  public static int sum(int k) {
    if (k > 0) { // Halting Condition
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
};