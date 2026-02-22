import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double num1 = n.nextDouble();
		System.out.println("Enter Second Number: ");
		double num2 = n.nextDouble();
		double add = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		if (num2 != 0){
			double div = num1 / num2;
			System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + " , " + sub + " , " + mul + " and " +div);
		}
		else{
			System.out.println("Error Cannot be Divided by Zero. Thus The addition, subtraction and multiplication value of 2 numbers " + num1 + " and " + num2 + " is " + add + " , " + sub + " , " + mul);
		}
	}
}
