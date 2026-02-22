import java.util.Scanner;
public class Income{
	public static void main(String[] args){
		Scanner I = new Scanner(System.in);
		System.out.println("Enter Salary Amount: ");
		double salary = I.nextDouble();
		System.out.println("Enter Bonus Amount: ");
		double bonus = I.nextDouble();
		double income = salary + bonus;
		System.out.println("The Salary in INR is " +salary+ " and Bonus in INR " +bonus+ " .Hence Total Income is INR " +income);
	}
}
