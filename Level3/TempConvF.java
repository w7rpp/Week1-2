import java.util.Scanner;
public class TempConvF{
	public static void main(String[] args){
		Scanner FC = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit: ");
		double temp_f = FC.nextDouble();
		// (F-32)*(5/9)= C
		double temp_c = (temp_f - (double)32) * ( (double)5 / (double)9);
		System.out.println("The " +temp_f+ " fahrenheit is " +temp_c+ " celsius");
	}
}
