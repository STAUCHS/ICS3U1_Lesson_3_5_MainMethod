# 3.5 The `main` Method & More User Input (taking off the training wheels)

All the programs we've written so far have been dependent on the CodeHS package, specifically the ConsoleProgram class.  We've used it to hide some of the ugly details that can get in the way of learning some of the basics. Now that we've explored methods, let's get into those ugly details we passed over.

### Before:
```java
public class Main extends ConsoleProgram {
  public void run() {
    // All the main code went here
  }
}
```

# The `main()` Method
When running a java program, the code that is run by default is the `main()` method.  This is similar to the `run()` method we previously used, however, it does not require us having to import the `ConsoleProgram`.

>A sample class with a main method:
```java
public class BasicProgram {
  public static void main(String[] args) {
    System.out.println("Hello basic java"); 	
  }
}
```

Essentially, the code that we want to run goes inside a method:
```java
  public static void main(String[] args){
    // your code goes here
  }
```

## Running a standard java program
To run a standard java program you must first compile and then run it. For example, to run the `NoTrainingWheels.java` program, you would enter the following into the command line:
```java
javac NoTrainingWheels.java
java NoTrainingWheels
```

## Programs with other Methods

Now that we are using the `main()` method, when we want to define other methods in our program, we need to add another item to the method definition header, `static`

```java
public class BasicProgram2 {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 5;
    int difference = diff(number1, number2);

    System.out.println("The difference is " + difference);
  }

  /**
   * Computes the difference between two numbers
   *
   * @param num1  The first number
   * @param num2  The second number
   * @return The difference between the numbers
   *
   */
  private static int diff(int num1, int num2) {
    return num1 - num2;
  } 
}
```

In the example above, notice how we had to put the keyword **`static`** before the return type in our method definition.

```java
  private static int diff(int num1, int num2){
    return num1 - num2;
  }
```

# User Input with Scanner

* We use `System.out` to print to the screen. The method `println()` is used.
* In order to read from the keyboard, instead of use `readInt()` or `readLine()`, we can use `System.in`
    * We also use the object Scanner from the Java Utility (`java.util`) Library.
* The method we need to call on from the Scanner object is 
    * `nextLine()` if you are reading a String
    * `nextInt()` if you are reading an integer value
    * `nextDouble()` if you are reading a double
    * `nextBoolean()` if you are reading a boolean


## Example
```java
// Create a scanner object
Scanner scan = new Scanner(System.in);

// Declare variable
String fullName;

// Get name from user
System.out.print("Enter your full name: ");
fulName = scan.nextLine();
```

# Complete Example with User Input
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String book1, book2, book3;

    System.out.println("Name your favourite book: ");
    book1 = scan.nextLine();

    System.out.println("Name your 2nd favourite book: ");
    book2 = scan.nextLine();

    System.out.println("Name your 3rd favourite book: ");
    book3 = scan.nextLine();

    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);
  }
}
```