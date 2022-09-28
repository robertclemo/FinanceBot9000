import java.util.Scanner;

public class Tracker {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your buying price per share: ");
    double buyingPrice = input.nextDouble();
    int day = 1;
    double closingPrice;
    double[] weekly = new double[7];
    
    input.close();
  }
}
