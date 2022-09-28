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
    
    int i = 0;
while (i < weekly.length) {
	System.out.println("Enter the closing price for the day " + day);
	closingPrice = input.nextDouble();
	double earnings = closingPrice - buyingPrice;
	weekly[i] = earnings;

	day = day + 1;
	i = i + 1;
   } // Not sure if this bracket needs to be here or not
if (earnings > 0) {
  System.out.printf("After day " + day + " you have gained $%.2f" + " per share since yesterday.",earnings); // System.out.printf helps format the value of the earnings variable and just print the value to 2 precision points, i.e. 234.5
  System.out.println(" ");
} else if (earnings < 0) {
  System.out.printf("After day " + day + " you have lost $%.2f" + " per share since yesterday.",(-earnings)); // Used a minus sign before earnings variable since its a loss.
  System.out.println(" ");
} else {
  System.out.println("After day " + day + ", you have no earnings per share");
}
  }
}
