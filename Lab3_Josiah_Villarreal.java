//Josiah Villarreal
//09-14-25
// Lab3
// I am showing my use of the math.pow by giving variables that will then solve the equation

//import scanner
import java.util.Scanner;
public class Lab3_Josiah_Villarreal {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 //Decalaring the variables
    double initialValue; //p
    int years;           //t
    double interestRate;  //r
    double finalValue;  // A
  //Prompt the user to enter the inputs
    System.out.print("Please enter the inital value of the home:");
    initialValue = scanner.nextDouble();

    System.out.print("Please enter the number of elapsed years:");
    years = scanner.nextInt();

    System.out.print("Please enter the interest rate:");
    interestRate = scanner.nextDouble();
 // Convert the percentage into decimals
    interestRate = interestRate / 100;
 // Calculate the compund interest
    finalValue = initialValue * Math.pow((1 + interestRate), years);
    // Display the results to the user 
    System.out.printf("The final value of the home is: %.2f%n", finalValue);
 //close the scanner
    scanner.close();





}
}
