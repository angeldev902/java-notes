### --------------------------------- JAVA

Source: https://www.w3schools.com/java/java_intro.asp

# Intro

Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter.
Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.
The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename
Every program must contain the main() method.

You should also note that each code statement must end with a semicolon (;).

Get java vsersion:

--> java -version

Code must be compile with:

--> javac FileName.java

Execute code with:

--> java Main

# Print text

Text must be wrapped inside double quotations marks ""
There is also a print() method, which is similar to println().
The only difference is that it does not insert a new line at the end of the output:

# Vars

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, sufficient for storing 6 to 7 decimal digits
double - Represent numbers with decimals, sufficient for storing 15 decimal digits
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false

To create a variable, you must specify the type and assign it a value:

--> type variableName = value;

final

If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

final int myNum = 15;
myNum = 20; // will generate an error: cannot assign a value to a final variable

- Note: For numbers is better use double

To declare more than one variable of the same type, you can use a comma-separated list:
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);

The general rules for naming variables are:

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter, and cannot contain whitespace
- Names can also begin with $ and \_
- Names are case-sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as int or boolean) cannot be used as names

# Java Data Types

Data types are divided into two groups:

- Primitive data types - includes byte, short, int, long, float, double, boolean and char
- Non-primitive data types - such as String, Arrays and Classes

# Java Numbers

Primitive number types are divided into two groups:

- Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

Most used is int

- Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.

# Java Type Casting

Type casting is when you assign a value of one primitive data type to another type.
In Java, there are two types of casting:

- Widening Casting (automatically) - converting a smaller type to a larger type size
  byte -> short -> char -> int -> long -> float -> double

- Narrowing Casting (manually) - converting a larger type to a smaller size type
  double -> float -> long -> int -> char -> short -> byte

# Java Operators

Source: https://w3schools.com/java/java_operators.asp

Only important difference is not exists '===' an '!==' only '==' and '!='

# Method Overloading

With method overloading, multiple methods can have the same name with different parameters:

int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

# Java Scope

In Java, variables are only accessible inside the region they are created. This is called scope.

----- Method Scope

Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:

public class Main {
public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);

}
}

Block Scope
A block of code refers to all of the code between curly braces {}.
Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared:

public class Main {
public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

// Code here CANNOT use x

}
}

# Java Recursion

Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

# Halting Condition

Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, which is the condition where the function stops calling itself.

# Java OOP

OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

OOP is faster and easier to execute
OOP provides a clear structure for the programs
OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
OOP makes it possible to create full reusable applications with less code and shorter development time
Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.

# Classes and Objects

A class is a template for objects, and an object is an instance of a class.
When the individual objects are created, they inherit all the variables and methods from the class.

class
fruit

object
Apple
Banana
Mango

# Java Classes/Objects

Java is an object-oriented programming language.
Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.
A Class is like an object constructor, or a "blueprint" for creating objects.

Create an Object

In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.
To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

# Using Multiple Classes

You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

Note: You don't need import o export files (apparently)

# Java Class Attributes

You could say that class attributes are variables within a class:

# Java Class Methods

The methods are declared within a class, and that they are used to perform certain actions

# Static vs. Public

We created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects

```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
```

# Java Constructors

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
```

Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.

### Java Modifiers

The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

We divide modifiers into two groups:

- Access Modifiers - controls the access level
- Non-Access Modifiers - do not control access level, but provides other functionality

# Access Modifiers

- For classes, you can use either public or default:

public --> The class is accessible by any other class
default --> The class is only accessible by classes in the same package. This is used when you don't specify a modifier.

- For attributes, methods and constructors, you can use the one of the following:

public --> The code is accessible for all classes
private --> The code is only accessible within the declared class
default --> The code is only accessible in the same package. This is used when you don't specify a modifier.
protected --> The code is accessible in the same package and subclasses.

# Non-Access Modifiers

- For classes, you can use either final or abstract:

final --> The class cannot be inherited by other classes
abstract --> The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.

- For attributes and methods, you can use the one of the following:

final --> Attributes and methods cannot be overridden/modified
static --> Attributes and methods belongs to the class, rather than an object
abstract --> Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
transient --> Attributes and methods are skipped when serializing the object containing them
synchronized --> Methods can only be accessed by one thread at a time
volatile --> The value of an attribute is not cached thread-locally, and is always read from the "main memory"

# Abstract

An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

```java
  // Code from filename: Main.java
  // abstract class
  abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
  }

  // Subclass (inherit from Main)
  class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
      System.out.println("Studying all day long");
    }
  }
  // End code from filename: Main.java

  // Code from filename: Second.java
  class Second {
    public static void main(String[] args) {
      // create an object of the Student class (which inherits attributes and methods from Main)
      Student myObj = new Student();

      System.out.println("Name: " + myObj.fname);
      System.out.println("Age: " + myObj.age);
      System.out.println("Graduation Year: " + myObj.graduationYear);
      myObj.study(); // call abstract method
    }
  }
```

### Java Encapsulation

# Encapsulation

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve (lograr) this, you must:

- declare class variables/attributes as private
- provide public get and set methods to access and update the value of a private variable

# Get and Set

You learned that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
};

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
};
```

# Why Encapsulation?

- Better control of class attributes and methods
- Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
- Flexible: the programmer can change one part of the code without affecting other parts
- Increased security of data

### Java Packages

# Java Packages & API

A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)

# Built-in Packages

The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.

The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.

To use a class or a package from the library, you need to use the import keyword:

- import package.name.Class; // Import a single class
- import package.name.\*; // Import the whole package

# Import a Class

If you find a class you want to use, for example, the Scanner class, which is used to get user input, write the following code:

```java
  import java.util.Scanner;
```

In the example above, java.util is a package, while Scanner is a class of the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read a complete line:

```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```

# Import a Package

There are many packages to choose from. In the previous example, we used the Scanner class from the java.util package. This package also contains date and time facilities, random-number generator and other utility classes.

To import a whole package, end the sentence with an asterisk sign (\*). The following example will import ALL the classes in the java.util package:

```java
  import java.util.*;
```

# User-defined Packages

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:

- root
- mypack
- MyPackageClass.java

More info: https://www.w3schools.com/java/java_packages.asp

### Java Inheritance

# Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

- subclass (child) - the class that inherits from another class
- superclass (parent) - the class being inherited from

To inherit from a class, use the extends keyword.
In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

```java
  class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
  }

  class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

      // Create a myCar object
      Car myCar = new Car();

      // Call the honk() method (from the Vehicle class) on the myCar object
      myCar.honk();

      // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
      System.out.println(myCar.brand + " " + myCar.modelName);
    }
  }
```

# The final Keyword

If you don't want other classes to inherit from a class, use the final keyword:

```java
  final class Vehicle {

  }

  class Car extends Vehicle {
  ...
  }
```

This return an error

### Java Polymorphism

# Java Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):

```java
  class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }

  class Pig extends Animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }

  class Dog extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }

  class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Animal myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }
```

# Why And When To Use "Inheritance" and "Polymorphism"?

It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

### Java Inner Classes

# Java Inner Classes

In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of the inner class:

```java
  class OuterClass {
    int x = 10;

    class InnerClass {
      int y = 5;
    }
  }

  public class Main {
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.y + myOuter.x);
    }
  }
```

# Private Inner Class

Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:

```java
class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
```

If you try to access a private inner class from an outside class, an error occurs:

# Static Inner Class

An inner class can also be static, which means that you can access it without creating an object of the outer class:

```java
  class OuterClass {
    int x = 10;

    static class InnerClass {
      int y = 5;
    }
  }

  public class Main {
    public static void main(String[] args) {
      OuterClass.InnerClass myInner = new OuterClass.InnerClass();
      System.out.println(myInner.y);
    }
  }
```

# Access Outer Class From Inner Class

One advantage of inner classes, is that they can access attributes and methods of the outer class:

```java
  class OuterClass {
    int x = 10;

    class InnerClass {
      public int myInnerMethod() {
        return x;
      }
    }
  }

  public class Main {
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.new InnerClass();
      System.out.println(myInner.myInnerMethod());
    }
  }
```

### Abstract Classes and Methods

Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is a non-access modifier, used for classes and methods:

- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

- Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

An abstract class can have both abstract and regular methods:

```java
  abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
      System.out.println("Zzz");
    }
  }
```

From the example above, it is not possible to create an object of the Animal class:

```java
  Animal myObj = new Animal(); // will generate an error
```

To access the abstract class, it must be inherited from another class. Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:

```java
  // Abstract class
  abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
  }

  // Subclass (inherit from Animal)
  class Pig extends Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
  }

  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig(); // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }
```

# Why And When To Use Abstract Classes and Methods?

To achieve security - hide certain details and only show the important details of an object.

### Java Interface

# Interfaces

Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group related methods with empty bodies:

```java
// interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}
```

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:

```java
  // Interface
  interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
  }

  // Pig "implements" the Animal interface
  class Pig implements Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
  }

  class Main {
    public static void main(String[] args) {
      Pig myPig = new Pig();  // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
    }
  }
```

# Notes on Interfaces:

- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

# Why And When To Use Interfaces?

1. To achieve security - hide certain details and only show the important details of an object (interface).

2. Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).

### Java Enums

# Enums

An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

```java
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }
```

You can access enum constants with the dot syntax:

```java
  Level myVar = Level.MEDIUM;
```

# Difference between Enums and Classes

An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

# Why And When To Use Enums?

Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc

### Java Date and Time

# Java Dates

Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes. For example:

- LocalDate: Represents a date (year, month, day (yyyy-MM-dd))
- LocalTime: Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
- LocalDateTime: Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
- DateTimeFormatter: Formatter for displaying and parsing date-time objects

Note: Date' ll take summer time

### Java ArrayList

# Java ArrayList

The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:

```java
  import java.util.ArrayList; // import the ArrayList class

  ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```

# Add Items

The ArrayList class has many useful methods. For example, to add elements to the list, use the add() method:

```java
  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars);
    }
  }
```

# Other Types

Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

```java
  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> myNumbers = new ArrayList<Integer>();
      myNumbers.add(10);
      myNumbers.add(15);
      myNumbers.add(20);
      myNumbers.add(25);
      for (int i : myNumbers) {
        System.out.println(i);
      }
    }
  }
```

# Sort an ArrayList

Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

```java
  import java.util.ArrayList;
  import java.util.Collections;  // Import the Collections class

  public class Main {
    public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      Collections.sort(cars);  // Sort cars
      for (String i : cars) {
        System.out.println(i);
      }
    }
  }
```

# Java LinkedList

# Java LinkedList

In the previous chapter, you learned about the ArrayList class. The LinkedList class is almost identical to the ArrayList:

```java
  // Import the LinkedList class
  import java.util.LinkedList;

  public class Main {
    public static void main(String[] args) {
      LinkedList<String> cars = new LinkedList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      System.out.println(cars);
    }
  }
```

# ArrayList vs. LinkedList

The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

# How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

# How the LinkedList works

The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

# When To Use

Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

# LinkedList Methods

For many cases, the ArrayList is more efficient as it is common to need access to random items in the list, but the LinkedList provides several methods to do certain operations more efficiently:

- addFirst() Adds an item to the beginning of the list
- addLast() Add an item to the end of the list
- removeFirst() Remove an item from the beginning of the list
- removeLast() Remove an item from the end of the list
- getFirst() Get the item at the beginning of the list
- getLast() Get the item at the end of the list

### Java HashMap

# Java HashMap

In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type). A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:

# Add Items

The HashMap class has many useful methods. For example, to add items to it, use the put() method:

```java
  // Import the HashMap class
  import java.util.HashMap;

  public class Main {
    public static void main(String[] args) {
      // Create a HashMap object called capitalCities
      HashMap<String, String> capitalCities = new HashMap<String, String>();

      // Add keys and values (Country, City)
      capitalCities.put("England", "London");
      capitalCities.put("Germany", "Berlin");
      capitalCities.put("Norway", "Oslo");
      capitalCities.put("USA", "Washington DC");
      System.out.println(capitalCities);
    }
  }
```

### Java HashSet

# Java HashSet

A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

# Add Items

The HashSet class has many useful methods. For example, to add items to it, use the add() method:

```java
  // Import the HashSet class
  import java.util.HashSet;

  public class Main {
    public static void main(String[] args) {
      HashSet<String> cars = new HashSet<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("BMW");
      cars.add("Mazda");
      System.out.println(cars);
    }
  }
```

Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.

# Check If an Item Exists

To check whether an item exists in a HashSet, use the contains() method:

```java
  cars.contains("Mazda");
```

### Java Wrapper Classes

# Java Wrapper Classes

Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

byte --> Byte
short --> Short
int --> Integer
long --> Long
float --> Float
double --> Double
boolean --> Boolean
char --> Character

Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):

# Creating Wrapper Objects

To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just print the object:

```java
  public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}
```

Since you're now working with objects, you can use certain methods to get information about the specific object.

For example, the following methods are used to get the value associated with the corresponding wrapper object: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

This example will output the same result as the example above:

```java
  public class Main {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt.intValue()); //5
    System.out.println(myDouble.doubleValue()); //5.99
    System.out.println(myChar.charValue());// A
  }
}
```

Another useful method is the toString() method, which is used to convert wrapper objects to strings.

In the following example, we convert an Integer to a String, and use the length() method of the String class to output the length of the "string":

```java
public class Main {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
```

### Java Exceptions - Try...Catch

# Java Exceptions

When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

# Java try and catch

The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

```java
public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
```

# Finally

The finally statement lets you execute code, after try...catch, regardless of the result:

```java
  public class Main {
    public static void main(String[] args) {
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } catch (Exception e) {
        System.out.println("Something went wrong.");
      } finally {
        System.out.println("The 'try catch' is finished.");
      }
    }
  }
```

# The throw keyword

The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

```java
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```

### What is a Regular Expression?

A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.

A regular expression can be a single character, or a more complicated pattern.

Regular expressions can be used to perform all types of text search and text replace operations.

Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:

Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

# Example

```java
  import java.util.regex.Matcher;
  import java.util.regex.Pattern;

  public class Main {
    public static void main(String[] args) {
      Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
      Matcher matcher = pattern.matcher("Visit W3Schools!");
      boolean matchFound = matcher.find();
      if(matchFound) {
        System.out.println("Match found");
      } else {
        System.out.println("Match not found");
      }
    }
  }
```

# Example Explained

In this example, The word "w3schools" is being searched for in a sentence.

First, the pattern is created using the Pattern.compile() method. The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.

The matcher() method is used to search for the pattern in a string. It returns a Matcher object which contains information about the search that was performed.

The find() method returns true if the pattern was found in the string and false if it was not found.

# Flags

Flags in the compile() method change how the search is performed. Here are a few of them:

- Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
- Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
- Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet

More info: https://www.w3schools.com/java/java_regex.asp

### Java Threads

# Java Threads

Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.

# Creating a Thread

There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:

```java
  public class Main extends Thread {
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
```

Another way to create a thread is to implement the Runnable interface:

```java
  public class Main implements Runnable {
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
```

# Running Threads

If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:

```java
  public class Main extends Thread {
    public static void main(String[] args) {
      Main thread = new Main();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
```

If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:

```java
  public class Main implements Runnable {
    public static void main(String[] args) {
      Main obj = new Main();
      Thread thread = new Thread(obj);
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
```

# Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.

# Concurrency Problems

Because threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The problems that result from this are called concurrency problems.

To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.

```java
  public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
      Main thread = new Main();
      thread.start();
      // Wait for the thread to finish
      while(thread.isAlive()) {
        System.out.println("Waiting...");
      }
      // Update amount and print its value
      System.out.println("Main: " + amount);
      amount++;
      System.out.println("Main: " + amount);
    }
    public void run() {
      amount++;
    }
  }
```

### Java Lambda Expressions

# Java Lambda Expressions

Lambda Expressions were added in Java 8.

A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

# Syntax

The simplest lambda expression contains a single parameter and an expression:

parameter -> expression

To use more than one parameter, wrap them in parentheses:

(parameter1, parameter2) -> expression

Expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as if or for. In order to do more complex operations, a code block can be used with curly braces. If the lambda expression needs to return a value, then the code block should have a return statement.

(parameter1, parameter2) -> { code block }

# Using Lambda Expressions

Lambda expressions are usually passed as parameters to a function:

```java
  import java.util.ArrayList;

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(5);
      numbers.add(9);
      numbers.add(8);
      numbers.add(1);
      numbers.forEach( (n) -> { System.out.println(n); } );
    }
  }
```

Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. The lambda expression should have the same number of parameters and the same return type as that method. Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.

# Example

Use Java's Consumer interface to store a lambda expression in a variable:

```java
  import java.util.ArrayList;
  import java.util.function.Consumer;

  public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(5);
      numbers.add(9);
      numbers.add(8);
      numbers.add(1);
      Consumer<Integer> method = (n) -> { System.out.println(n); };
      numbers.forEach( method );
    }
  }
```

To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type. Calling the interface's method will run the lambda expression:

# Example

Create a method which takes a lambda expression as a parameter:

```java
  interface StringFunction {
    String run(String str);
  }

  public class Main {
    public static void main(String[] args) {
      StringFunction exclaim = (s) -> s + "!";
      StringFunction ask = (s) -> s + "?";
      printFormatted("Hello", exclaim);
      printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
      String result = format.run(str);
      System.out.println(result);
    }
  }
```

### Java Advanced Sorting (Comparator and Comparable)

# Java Advanced Sorting

In the List Sorting Chapter, you learned how to sort lists alphabetically and numerically, but what if the list has objects in it?

To sort objects you need to specify a rule that decides how objects should be sorted. For example, if you have a list of cars you might want to sort them by year, the rule could be that cars with an earlier year go first.

The Comparator and Comparable interfaces allow you to specify what rule is used to sort objects.

Being able to specify a sorting rule also allows you to change how strings and numbers are sorted.

# Comparators

An object that implements the Comparator interface is called a comparator.

The Comparator interface allows you to create a class with a compare() method that compares two objects to decide which one should go first in a list.

The compare() method should return a number which is:

- Negative if the first object should go first in a list.
- Positive if the second object should go first in a list.
- Zero if the order does not matter.

A class that implements the Comparator interface might look something like this:

# Example

```java
  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.Comparator;

  // Define a Car class
  class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
      brand = b;
      model = m;
      year = y;
    }
  }

  // Create a comparator
  class SortByYear implements Comparator {
    public int compare(Object obj1, Object obj2) {
      // Make sure that the objects are Car objects
      Car a = (Car) obj1;
      Car b = (Car) obj2;

      // Compare the year of both objects
      if (a.year < b.year) return -1; // The first car has a smaller year
      if (a.year > b.year) return 1;  // The first car has a larger year
      return 0; // Both cars have the same year
    }
  }

  public class Main {
    public static void main(String[] args) {
      // Create a list of cars
      ArrayList<Car> myCars = new ArrayList<Car>();
      myCars.add(new Car("BMW", "X5", 1999));
      myCars.add(new Car("Honda", "Accord", 2006));
      myCars.add(new Car("Ford", "Mustang", 1970));

      // Use a comparator to sort the cars
      Comparator myComparator = new SortByYear();
      Collections.sort(myCars, myComparator);

      // Display the cars
      for (Car c : myCars) {
        System.out.println(c.brand + " " + c.model + " " + c.year);
      }
    }
  }
```

# Using a Lambda Expression

To make the code shorter, the comparator can be replaced with a lambda expression which has the same arguments and return value as the compare() method:

```java
  Collections.sort(myCars, (obj1, obj2) -> {
    Car a = (Car) obj1;
    Car b = (Car) obj2;
    if (a.year < b.year) return -1;
    if (a.year > b.year) return 1;
    return 0;
  });
```

# The Comparable Interface

The Comparable interface allows an object to specify its own sorting rule with a compareTo() method.

The compareTo() method takes an object as an argument and compares the comparable with the argument to decide which one should go first in a list.

Like the comparator, the compareTo() method returns a number which is:

- Negative if the comparable should go first in a list.
- Positive if the other object should go first in a list.
- Zero if the order does not matter.

# Example

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class which is comparable
class Car implements Comparable {
  public String brand;
  public String model;
  public int year;

  public Car(String b, String m, int y) {
    brand = b;
    model = m;
    year = y;
  }

  // Decide how this object compares to other objects
  public int compareTo(Object obj) {
  	Car other = (Car)obj;
    if(year < other.year) return -1; // This object is smaller than the other one
    if(year > other.year) return 1;  // This object is larger than the other one
    return 0; // Both objects are the same
  }
}

public class Main {
  public static void main(String[] args) {
    // Create a list of cars
    ArrayList<Car> myCars = new ArrayList<Car>();
    myCars.add(new Car("BMW", "X5", 1999));
    myCars.add(new Car("Honda", "Accord", 2006));
    myCars.add(new Car("Ford", "Mustang", 1970));

    // Sort the cars
    Collections.sort(myCars);

    // Display the cars
    for (Car c : myCars) {
      System.out.println(c.brand + " " + c.model + " " + c.year);
    }
  }
}
```
