import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		Scanner DO = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double a = DO.nextInt();
		System.out.println("Enter Second Number: ");
		double b = DO.nextInt();
		System.out.println("Enter Third Number: ");
		double c = DO.nextInt();
		double s1 = a + b * c;
		double s2 = a * b + c;
		double s3 = c + a / b;
		double s4 = a % b + c;
		System.out.println("The Result of Int Operations are " +s1+ " , " +s2+ " , " +s3+ " and " +s4);
	}
}
