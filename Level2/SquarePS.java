import java.util.Scanner;
public class SquarePS{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Perimeter of Square: ");
		double perimeter = s.nextDouble();
		// Perimeter of Square = 4 * Side of Square
		double side = perimeter / 4.0;
		System.out.println("The Length of the Side of the Square is " +side+ " whose perimeter is " +perimeter);
	}
}
