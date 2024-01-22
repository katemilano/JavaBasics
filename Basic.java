//Basic Course Summary

//Comment

//Print

System.out.println("Hello World");

public class Sandbox {
    public static void main(string[] args){
        System.out.println("Hello World");
    }
}
//short cut type sout *enter*



//BoilerPlate
//programs have to include this to function
//Tells what program is being called
//example above it is Sandbox
//corresponds to name of the file

//CommandParameters
//for print command its parameters are passed through by placing them inside parenthesis

//Semicolon Separates Commands
//commands are serparated by a semicolon

//Input
//refers to written text by user to program, always read as a string
//reading input we use scanner tool that comes with Java
//add import to top: java.util.Scanner;
//add scanner: scanner = new Scanner(System.in);
//example
import java.util.Scanner;

public class Program{
    public static void main(string[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a message");
        String message = scanner.nextLine();
        System.out.println(message);
    }
}
//nextLine(): it waits till user inputs and presses enter and turns it into string


//Fundamentals of Strings
String message = scanner.nextLine();
String message = " "; //String Literal
String message = variable; 
//Variable: type of variable: name of variable
//Concatanation: "Hello" + message

//Variable Types
    //String: texts
    //int: whole numbers
    //double: floating-point numbers
    //boolean: true/false
//variables can't be declared twice
    //NO ALLOWED
    //double pi = 3.14
    //double pi = 3.141592

    //ALLOWED
    //double pi = 3.14
    //pi = 3.141592


//Naming: Use camelCase
//name can't being with a number or be only numbers
//name can't already be used

valueOf();
//converts a string to an integar
    //Example:
        String values ="42";
        int value = Integar.valueOf(values);
//converting to double
        String values = "43.2";
        double value = Double.valueOf(values);
//converting to boolean
        String values = "true";
        boolean value = Boolean.valueOf(values);

//Example

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give a integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        Double dble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dble);
        System.out.println("You gave the boolean " + boo);

    }
}


//Calculating with numbers
//Straight forward: +, -, /, *
//PEMDAS
    //DIVISION
    //if all the values in a division expression are integers than the answer will come out as an integer
        //example
        int first = 3;
        int second = 2;
        double result = first / second;
        //result is 1

        //example
        double whenDividendIsFloat = 3.0 / 2;
        System.out.println(whenDividendIsFloat); // prints 1.5

        double whenDivisorIsFloat = 3 / 2.0;
        System.out.println(whenDivisorIsFloat); // prints 1.5

        //can change into a double by putting a double in front of it
        int first = 3;
        int second = 2;

        double result1 = (double) first / second;
        System.out.println(result1); // prints 1.5

        double result2 = first / (double) second;
        System.out.println(result2); // prints 1.5

        double result3 = (double) (first / second);
        System.out.println(result3); // prints 1.0

        //example
        int integer = (int) 3.0 / 2;
        System.out.println(integer);  // prints 1

        //example
        int dividend = 3;
        int divisor = 2;

        double result = 1.0 * dividend / divisor;
        System.out.println(result); //prints 1.5

        

