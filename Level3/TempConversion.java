import java.util.Scanner;
public class TempConversion{
	public static void main(String[] args){
		Scanner CF = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius: ");
		double temp_c = CF.nextDouble();
		// (C*(9/5))+32 = F
		double temp_f = (temp_c * ( (double)9 / (double)5)) + (double)32;
		System.out.println("The " +temp_c+ " celsius is " +temp_f+ " fahrenheit");
	}
}
