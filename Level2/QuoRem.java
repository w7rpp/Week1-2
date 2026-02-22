import java.util.Scanner;
public class QuoRem{
	public static void main(String[] args){
		Scanner Q = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = Q.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = Q.nextInt();
		if (num2 !=0){
			int quo = num1 / num2;
			int rem = num1 % num2; 
			System.out.println("The Quotient is " +quo+ " and Remainder is " +rem+ " of two numbers " +num1+ " and " +num2);
		}
	}
}
