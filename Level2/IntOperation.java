import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		Scanner IO = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = IO.nextInt();
		System.out.println("Enter Second Number: ");
		int b = IO.nextInt();
		System.out.println("Enter Third Number: ");
		int c = IO.nextInt();
		int s1 = a + b * c;
		int s2 = a * b + c;
		int s3 = c + a / b;
		int s4 = a % b + c;
		System.out.println("The Result of Int Operations are " +s1+ " , " +s2+ " , " +s3+ " and " +s4);
	}
}
