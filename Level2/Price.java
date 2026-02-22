import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner P = new Scanner(System.in);
		System.out.println("Enter The Price of Item: ");
		double price = P.nextDouble();
		System.out.println("Enter Quantity of Items: ");
		double quantity = P.nextDouble();
		double TotalPrice = price * quantity;
		System.out.println("The Total Price is INR " +TotalPrice+ " if the Quantity is " +quantity+ " and Unit Price is INR " +price);
	}
}
