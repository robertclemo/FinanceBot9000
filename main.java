import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
  
    int numberOne, numberTwo;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number:");
    numberOne = input.nextInt();
    System.out.println("Enter the second number:");
    numberTwo = input.nextInt();
    System.out.println("Addition is, " + (numberOne + numberTwo));
    input.close();
    }
   }
